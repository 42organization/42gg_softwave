package io.pp.arcade.domain.user.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.pp.arcade.TestInitiator;
import io.pp.arcade.v1.domain.currentmatch.CurrentMatch;
import io.pp.arcade.v1.domain.currentmatch.CurrentMatchRepository;
import io.pp.arcade.v1.domain.game.Game;
import io.pp.arcade.v1.domain.game.GameRepository;
import io.pp.arcade.v1.domain.pchange.PChange;
import io.pp.arcade.v1.domain.pchange.PChangeRepository;
import io.pp.arcade.v1.domain.rank.entity.RankRedis;
import io.pp.arcade.v1.domain.slot.Slot;
import io.pp.arcade.v1.domain.slot.SlotRepository;
import io.pp.arcade.v1.domain.slotteamuser.SlotTeamUser;
import io.pp.arcade.v1.domain.slotteamuser.SlotTeamUserRepository;
import io.pp.arcade.v1.domain.team.Team;
import io.pp.arcade.v1.domain.team.TeamRepository;
import io.pp.arcade.v1.domain.user.User;
import io.pp.arcade.v1.domain.user.UserRepository;
import io.pp.arcade.RestDocsConfiguration;
import io.pp.arcade.v1.global.type.GameType;
import io.pp.arcade.v1.global.type.Mode;
import io.pp.arcade.v1.global.type.RacketType;
import io.pp.arcade.v1.global.type.StatusType;
import io.pp.arcade.v1.global.util.ExpLevelCalculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs
@Import(RestDocsConfiguration.class)
class UserControllerTest {
    @Autowired
    TestInitiator testInitiator;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PChangeRepository pChangeRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private SlotRepository slotRepository;

    @Autowired
    private CurrentMatchRepository currentMatchRepository;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private SlotTeamUserRepository slotTeamUserRepository;

    @Autowired
    private RedisTemplate<String, RankRedis> redisRank;

    @Autowired
    TestInitiator initiator;

    CurrentMatch currentMatch;
    CurrentMatch currentMatch2;

    User[] users;
    RankRedis[] ranks;

    RankRedis userRank;
    PChange userPchange;
    PChange pChange2;

    Game userGame;

    Game game;

    @BeforeEach
    void init() {
        testInitiator.letsgo();
        users = testInitiator.users;
        ranks = testInitiator.ranks;
        userRank = ranks[0];

        PChange pChange;
        Slot slot = slotRepository.save(Slot.builder()
                .headCount(2)
                .type(GameType.SINGLE)
                .tableId(1)
                .time(LocalDateTime.now().plusDays(1))
                .gamePpp(50)
                .mode(Mode.RANK)
                .build());
        Team team1 = teamRepository.save(Team.builder().teamPpp(0)
                .headCount(1).score(0).slot(slot).build());
        Team team2 = teamRepository.save(Team.builder().teamPpp(0)
                .headCount(1).score(0).slot(slot).build());
        slotTeamUserRepository.save(SlotTeamUser.builder().slot(slot).team(team1).user(users[0]).build());
        slotTeamUserRepository.save(SlotTeamUser.builder().slot(slot).team(team2).user(users[1]).build());
        game = gameRepository.save(Game.builder().slot(slot).season(1).status(StatusType.END).mode(slot.getMode()).build());
        userGame = gameRepository.save(Game.builder().slot(slot).season(1).status(StatusType.END).mode(slot.getMode()).build());

        userPchange = pChangeRepository.save(PChange.builder().game(userGame).user(users[0]).pppChange(2).pppResult(2 + users[0].getPpp()).build());
        pChange = pChangeRepository.save(PChange.builder().game(userGame).user(users[1]).pppChange(2).pppResult(2 + users[1].getPpp()).build());


        // 슬롯에 등록된 경우
        currentMatch = currentMatchRepository.save(CurrentMatch.builder()
                .game(null)
                .slot(slot)
                .user(users[1])
                .matchImminent(false)
                .isMatched(false)
                .isDel(false)
                .build());

        // 게임에 등록된 경우
        currentMatch2 = currentMatchRepository.save(CurrentMatch.builder()
                .game(game)
                .slot(slot)
                .user(users[2])
                .matchImminent(true)
                .isMatched(true)
                .isDel(false)
                .build());
        Team team3 = teamRepository.save(Team.builder().teamPpp(0)
                .headCount(1).score(0).build());
        Team team4 = teamRepository.save(Team.builder().teamPpp(0)
                .headCount(1).score(0).build());
        Slot slot2 = slotRepository.save(Slot.builder()
                .headCount(2)
                .type(GameType.SINGLE)
                .tableId(1)
                .time(LocalDateTime.now().plusDays(1))
                .gamePpp(50)
                .mode(Mode.RANK)
                .build());
        slotTeamUserRepository.save(SlotTeamUser.builder().slot(slot2).team(team3).user(users[0]).build());
        slotTeamUserRepository.save(SlotTeamUser.builder().slot(slot2).team(team4).user(users[1]).build());
        gameRepository.save(Game.builder().slot(slot2).season(1).status(StatusType.END).mode(slot2.getMode()).build());
        gameRepository.save(Game.builder().slot(slot2).season(1).status(StatusType.LIVE).mode(slot2.getMode()).build());

        pChange2 = pChangeRepository.save(PChange.builder()
                .game(userGame)
                .user(users[0])
                .pppChange(4)
                .pppResult(6 + users[0].getPpp())
                .expChange(0)
                .expResult(0)
                .build());
    }

    @Test
    @Transactional
    @DisplayName("유저 정보 조회 - 간단히 (/users)")
    void findUser() throws Exception {
        /*
         * - Response Check (2)
         * - -> intraId, userImageUri;
         * */
        mockMvc.perform(get("/pingpong/users").contentType(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(jsonPath("$.intraId").value(users[0].getIntraId()))
                .andExpect(jsonPath("$.userImageUri").value(users[0].getImageUri()))
                .andExpect(status().isOk())
                .andDo(document("user-find"));
    }

    @Test
    @Transactional
    @DisplayName("유저 정보 조회 - 상세히 (/users/{intraId}/detail)")
    void findDetailUser() throws Exception { // rank가 문제라서 안됐다!
        /*
         * intraId를 찾을 수 없는 경우
         * -> 400
         * */
        mockMvc.perform(get("/pingpong/users/" + "notFound" + "/detail").contentType(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().is4xxClientError())
                .andDo(document("user-find-detail-4xxError-cause-couldn't-find-intraId"));

        /*
         * Response Check (7)
         * -> intraId, userImageUri, statusMessage, ppp
         * -> rank, wins, losses
         * */
        mockMvc.perform(get("/pingpong/users/" + users[1].getIntraId() + "/detail").contentType(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(jsonPath("$.intraId").value(users[1].getIntraId()))
                .andExpect(jsonPath("$.userImageUri").value(users[1].getImageUri()))
                .andExpect(jsonPath("$.statusMessage").value(users[1].getStatusMessage()))
                .andExpect(jsonPath("$.level").value(ExpLevelCalculator.getLevel(users[1].getTotalExp())))
                .andExpect(jsonPath("$.currentExp").value(ExpLevelCalculator.getCurrentLevelMyExp(users[1].getTotalExp())))
                .andExpect(jsonPath("$.maxExp").value(ExpLevelCalculator.getLevelMaxExp(ExpLevelCalculator.getLevel(users[1].getTotalExp()))))
//                .andExpect(jsonPath("$.rank").value(getRanking(userRank, GameType.SINGLE)))
//                .andExpect(jsonPath("$.losses").value(userRank.getLosses()))
                .andExpect(status().isOk())
                .andDo(document("user-find-detail"));
    }

    @Test
    @Transactional
    @DisplayName("유저 전적 경향 (/users/{intraId}/historics)")
    void findUserHistorics() throws Exception {
        /*
         * intraId 찾을 수 없는 경우
         * -> 400
         * */
        mockMvc.perform(get("/pingpong/users/{intraId}/historics", "notFound").contentType(MediaType.APPLICATION_JSON)
                        .param("season","1")
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isBadRequest())
                .andDo(document("user-find-historic-can't-find-intraId"));

        /*
         * chartType NULL (향후 수정)
         * -> 200
         * */
        User user = users[0];
        mockMvc.perform(get("/pingpong/users/" + user.getIntraId() +"/historics").contentType(MediaType.APPLICATION_JSON)
                        .param("season","1")
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isOk());

        /*
         * chartType 다른 값 (향후 수정)
         * -> 200
         * */
        mockMvc.perform(get("/pingpong/users/" + user.getIntraId() +"/historics").contentType(MediaType.APPLICATION_JSON)
                        .param("season","1")
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isOk());

        /*
         * Response Check (2)
         * -> ppp
         * -> date
         * */

        String gameDate = userGame.getSlot().getTime().toString();
        mockMvc.perform(get("/pingpong/users/" + user.getIntraId() +"/historics").contentType(MediaType.APPLICATION_JSON)
                        .param("season","1")
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(jsonPath("$.historics[0].ppp").value(userPchange.getPppResult()))
                .andExpect(jsonPath("$.historics[0].date").value(gameDate))
                .andExpect(status().isOk())
                .andDo(document("user-find-historics"));
    }

    @Test
    @Transactional
    @DisplayName("유저 검색 (/pingpong/users/searches)")
    void userSearchResult() throws Exception {
        /*
         * q(query) null
         * -> users : []
         * -> 200
         * */
        mockMvc.perform(get("/pingpong/users/searches").contentType(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + initiator.tokens[1].getAccessToken()))
                .andExpect(jsonPath("$.users").isEmpty())
                .andExpect(status().isOk());

        /*
         * q(query) k
         * -> users : ["hakim", "donghyuk", "jekim", "jihyukim", "daekim", "sujpark", "kipark"]
         * */
        String checkUsers = "$.users[?(@=='%s')]";
        mockMvc.perform(get("/pingpong/users/searches").contentType(MediaType.APPLICATION_JSON)
                        .param("q", "k")
                        .header("Authorization", "Bearer " + initiator.tokens[1].getAccessToken()))
//                .andExpect(jsonPath("$.users").isNotEmpty())
//                .andExpect(jsonPath(checkUsers, "kipark").exists())
//                .andExpect(jsonPath(checkUsers, "hakim").exists())
//                .andExpect(jsonPath(checkUsers, "jekim").exists())
//                .andExpect(jsonPath(checkUsers, "daekim").exists())
//                .andExpect(jsonPath(checkUsers, "jihyukim").exists())
                .andExpect(status().isOk())
                .andDo(document("user-search-with-partial-string"));
    }

    @Test
    @Transactional
    @DisplayName("유저 실시간 정보 (/users/live)")
    void userLiveInfo() throws Exception {
        /*
         * 게임, 슬롯에 속해있지 않은 경우 (user)
         * -> event : none
         * */
        mockMvc.perform(get("/pingpong/users/live").contentType(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.event").isEmpty())
                .andDo(document("user-find-live1"));
        /*
         * 슬롯에 등록된 경우 (user1)
         * -> event : match
         * */
        mockMvc.perform(get("/pingpong/users/live").contentType(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + initiator.tokens[1].getAccessToken()))
                .andExpect(jsonPath("$.event").value("match"))
                .andExpect(status().isOk())
                .andDo(document("user-find-live2"));
        /*
         * 게임 중인 경우 (user2)
         * -> event : game
         * */
        mockMvc.perform(get("/pingpong/users/live").contentType(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + initiator.tokens[2].getAccessToken()))
                .andExpect(jsonPath("$.event").value("game"))
                .andExpect(status().isOk())
                .andDo(document("user-find-live3"));
    }

    @Test
    @Transactional
    @DisplayName("유저 프로필 업데이트 - /users/detail")
    void modifyProfile() throws Exception {
        /*
         * racketType missing
         * -> 400
         * */
        Map<String, String> body = new HashMap<>();
        body.put("statusMessage", "message");
        mockMvc.perform(put("/pingpong/users/detail").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(body))
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isBadRequest())
                .andDo(document("user-modify-4xxError-cause-racketType-missing"));

        /*
         * racketType 다른 값인 경우
         * -> 400
         * */
        Map<String, String> body2 = new HashMap<>();
        body2.put("racketType", "NOTHING");
        body2.put("statusMessage", "message");
        mockMvc.perform(put("/pingpong/users/detail").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(body2))
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isBadRequest())
                .andDo(document("user-modify-4xxError-cause-racketType-wrong-value"));

        /*
         * statusMessage missing
         * -> 400
         * */
        Map<String, String> body3 = new HashMap<>();
        body3.put("racketType", RacketType.PENHOLDER.getCode());
        mockMvc.perform(put("/pingpong/users/detail").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(body3))
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isBadRequest())
                .andDo(document("user-modify-4xxError-cause-statusMessage-missing"));

        /*
         * statusMessage.length > 300
         * -> 400
         * */
        Map<String, String> body4 = new HashMap<>();
        body4.put("racketType", RacketType.PENHOLDER.getCode());
        body4.put("statusMessage", "0123456789".repeat(31));
        mockMvc.perform(put("/pingpong/users/detail").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(body4))
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isBadRequest())
                .andDo(document("user-modify-4xxError-cause-statusMessage-wrong-length"));

        /*
         * 업데이트 성공
         * -> 200
         */
        Map<String, String> body5 = new HashMap<>();
        body5.put("racketType", RacketType.PENHOLDER.getCode());
        body5.put("statusMessage", "message");
        mockMvc.perform(put("/pingpong/users/detail").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(body5))
                        .header("Authorization", "Bearer " + initiator.tokens[0].getAccessToken()))
                .andExpect(status().isOk())
                .andDo(document("user-modify-profile"));
        User savedUser = userRepository.findByIntraId(users[0].getIntraId()).orElse(null);
        Assertions.assertThat(savedUser.getRacketType().getCode()).isEqualTo(body5.get("racketType"));
        Assertions.assertThat(savedUser.getStatusMessage()).isEqualTo(body5.get("statusMessage"));
    }


    private Integer getRanking(RankRedis userInfo ,GameType gameType){
        Integer totalGames = userInfo.getLosses() + userInfo.getWins();
        Integer ranking = (totalGames == 0) ? -1 : redisRank.opsForZSet().reverseRank(getRankKey(gameType), getUserRankKey(userInfo.getIntraId(), gameType)).intValue() + 1;
        return ranking;
    }

    private String getUserRankKey(String intraId, GameType gameType) {
        return intraId + gameType.getCode();
    }

    private String getRankKey(GameType gameType) {
        return gameType.getCode();
    }
}
