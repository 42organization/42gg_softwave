package io.pp.arcade.v1.domain.guest;

public class DogAdjectives {
    private static final String[] adjectives = {"가강한", "가경한", "가공한", "가긍한", "가난한", "가느스름한", "가능한", "가닥가닥한", "가당한", "가득가득한", "가득한", "가든가든한", "가든한", "가들막한", "가뜩가뜩한", "가뜩한", "가뜬한", "가랑가랑한", "가려한", "가련한", "가마득한", "가마반지르한", "가만한", "가무끄름한", "가무레한", "가무숙숙한", "가무스레한", "가무스름한", "가무잡잡한", "가물가물한", "가뭇가뭇한", "가뭇한", "가분한", "가빈친로한", "가빈한", "가뿐가뿐한", "가뿐한", "가상한", "가슬가슬한", "가슴츠레한", "가엄한", "가증한", "가지런한", "가직한", "가칠가칠한", "가칠한", "가칫가칫한", "가탄한", "가통한", "가한", "가합한", "가혹한", "각근한", "각다분한", "각박한", "각별한", "각양각이한", "각이한", "간간짭짤한", "간간한", "간간한", "간거한", "간결한", "간경한", "간고한", "간곡한", "간교한", "간구한", "간단간단한", "간단명료한", "간단한", "간독한", "간독한", "간동한", "간략한", "간명직절한", "간명한", "간묵한", "간사한", "간사한", "간소한", "간악무도한", "간악한", "간오한", "간잔지런한", "간절한", "간조한", "간지한", "간질간질한", "간초한", "간측한", "간탐한", "간특한", "간편한", "간핍한", "간휼한", "간흉한", "간힐한", "갈걍갈걍한", "갈급한", "갈쌍한", "갈쭉한", "갈한", "감감한", "감개무량한", "감격무지한", "감사무지한", "감사한", "감숭한", "감실감실한", "감연한", "감작감작한", "감창한", "감파르잡잡한", "갑갑궁금한", "갑갑한", "강강한", "강개한", "강건한", "강건한", "강건한", "강경한", "강고한", "강녕한", "강대한", "강력한", "강렬한", "강명한", "강박한", "강성한", "강악한", "강약부동한", "강왕한", "강용한", "강인한", "강잉한", "강직한", "강퍅한", "강한", "강한", "개결한", "개연한", "개운한", "개웃한", "개절한", "개활한", "갸륵한", "갸륵한", "갸름한", "갸우듬한", "갸우뚱갸우뚱한", "갸우뚱한", "갸웃갸웃한", "갸웃한", "걀쭉걀쭉한", "걀쭉한", "걀쯔막한", "걀쯤걀쯤한", "걀찍걀찍한", "걀찍한", "거거익심한", "거나한", "거대한", "거덜거덜한", "거든거든한", "거든한", "거뜬거뜬한", "거뜬한", "거룩한", "거만한", "거머누르께한", "거무데데한", "거무뎅뎅한", "거무레한", "거무숙숙한", "거무죽죽한", "거무충충한", "거무칙칙한", "거무튀튀한", "거무트름한", "거물거물한", "거뭇거뭇한", "거뭇한", "거북한", "거분거분한", "거분한", "거뿐한", "거슬거슬한", "거식한", "거오한", "거우듬한", "거욷한", "거칠거칠한", "거칫거칫한", "거칫한", "거풋한", "거행불민한", "걱실걱실한", "건강한", "건건찝찔한", "건둔한", "건드레한", "건성드뭇한", "건승한", "건실한", "건장한", "건재한", "건전한", "건조무미한", "건조한", "건한", "걸걸한", "걸걸한", "걸대한", "걸쩍지근한", "걸쭉한", "검루한", "검박한", "검소한", "검숭한", "검실검실한", "검약한", "검측측한", "검특한", "겁겁한", "겅성드뭇한", "게슴츠레한", "게저분한", "게적지근한", "격렬한", "격심한", "격한", "견강한", "견고한", "견실한", "견확한", "결곡한", "결백한", "결연한", "결정한", "결한", "겸공한", "겸손한", "겸연한", "겸전한", "겸폐한", "겸허한", "겹겹한", "경경한", "경망한", "경묘한", "경미한", "경세한", "경소한", "경소한", "경솔한", "경예한", "경조부박한", "경직한", "경첩한", "경첩한", "경청한", "경쾌한", "경편한", "경한", "경홀한", "고결한", "고귀한", "고급한", "고단한", "고답한", "고도한", "고독한", "고들고들한", "고루한", "고리타분한", "고립무원한", "고릿한", "고마마한", "고만고만한", "고만한", "고매한", "고명한", "고명한", "고박한", "고방한", "고부슴한", "고부장한", "고분고분한", "고불고불한", "고상한", "고소한", "고스란한", "고슬고슬한", "고실고실한", "고아한", "고약한", "고요한", "고원한", "고자누룩한", "고적한", "고정불변한", "고정한", "고졸한", "고준한", "고즈넉한", "고지식한", "고혈한", "곡진한", "곤곤한", "곤궁한", "곤란한", "곤한", "골똘한", "골막골막한", "골막한", "골싹골싹한", "골싹한", "곰바지런한", "곱단한", "곱살한", "곱상한", "곱송한", "곱슬한", "공고한", "공공연한", "공공한", "공교한", "공구한", "공명정대한", "공명한", "공사다망한", "공소한", "공손한", "공순한", "공연한", "공정한", "공칙한", "공편한", "공평무사한", "공평한", "공한", "공허한", "공활한", "과감한", "과격한", "과다한", "과당한", "과대한", "과도한", "과람한", "과묵한", "과문한", "과민한", "과소한", "과욕한", "과인한", "과중한", "과한", "관곡한", "관대한", "관숙한", "관활한", "관후한", "괄괄한", "괄한", "광대무변한", "광대한", "광명정대한", "광범위한", "광범한", "광패한", "광포한", "광폭한", "광활한", "괘씸한", "괜한", "괴걸한", "괴괴한", "괴기한", "괴란한", "괴벽한", "괴상망측한", "괴상야릇한", "괴상한", "괴악망측한", "괴악한", "괴위한", "괴이한", "괴적한", "괴죄죄한", "괴팍한", "괴한", "괴휼한", "굉걸한", "굉굉한", "굉렬한", "굉박한", "굉연한", "굉장한", "굉창한", "교교한", "교만한", "교묘한", "교민한", "교사한", "교앙한", "교치한", "교활한", "구간한", "구구한", "구깃구깃한", "구뜰한", "구리터분한", "구릿한", "구부스름한", "구부슴한", "구부정한", "구불구불한", "구수한", "구순한", "구저분한", "구전한", "구족한", "구중중한", "구지레한", "구질구질한", "구집지레한", "구차한", "구태의연한", "국보간난한", "군간한", "군급한", "군박한", "군색한", "군졸한", "군핍한", "굳건한", "굴강한", "굴먹굴먹한", "굴썩굴썩한", "굴썩한", "굵직굵직한", "굵직한", "굽슬굽슬한", "궁극한", "궁금답답한", "궁금한", "궁박한", "궁벽한", "궁색한", "궁졸한", "궁핍한", "궁한", "궁흉극악한", "권귀한", "궐연한", "궤격한", "궤휼한", "귀부한", "귀중한", "귀축축한", "귀한", "균등한", "균안한", "균정한", "균질한", "그늑한", "그득그득한", "그득한", "그들먹한", "그뜩그뜩한", "그뜩한", "그러저러한", "그러한", "그럴싸한", "그럼직한", "그렁그렁한", "그만그만한", "그만저만한", "그만한", "그무레한", "그악한", "그윽한", "극가한", "극귀한", "극렬한", "극명한", "극미한", "극빈한", "극사한", "극성한", "극심한", "극악한", "극중한", "극진한", "극친한", "근간한", "근검한", "근검한", "근근자자한", "근근한", "근근한", "근리한", "근면한", "근밀한", "근사한", "근소한", "근엄한", "근질근질한", "근한", "글썽글썽한", "글썽한", "급격한", "급급한", "급박한", "급속한", "급한", "긍측한", "기걸한", "기고만장한", "기괴망측한", "기괴한", "기구한", "기궁한", "기기묘묘한", "기려한", "기름기름한", "기묘한", "기민한", "기박한", "기발한", "기상천외한", "기세당당한", "기세등등한", "기세충천한", "기연가미연가한", "기연미연한", "기연한", "기우듬한", "기우뚱기우뚱한", "기우뚱한", "기웃기웃한", "기웃한", "기위한", "기이한", "기절한", "기초한", "기특한", "기험한", "기혼한", "긴가민가한", "긴급한", "긴밀한", "긴박한", "긴요한", "긴절한", "긴한", "길쭉길쭉한", "길쭉한", "길쯤길쯤한", "길찍길찍한", "길찍한", "길한", "깊숙한", "까끄름한", "까끌까끌한", "까랑까랑한", "까마득한", "까마말쑥한", "까마반지르한", "까마아득한", "까무대대한", "까무숙숙한", "까무잡잡한", "까무총총한", "까무칙칙한", "까무퇴퇴한", "까물까물한", "까뭇까뭇한", "까뭇한", "까스스한", "까슬까슬한", "까슬한", "까칠까칠한", "까칠한", "까칫한", "깍듯한", "깐깐한", "깐죽깐죽한", "깔깔한", "깔끔한", "깔낏한", "깔딱한", "깔밋한", "깜깜한", "깡똥한", "깡똥한", "깡총한", "깨고소한", "깨끔한", "깨끗한", "깨나른한", "꺄우뚱한", "꺄웃한", "꺼끌꺼끌한", "꺼룩한", "꺼림칙한", "꺼림텁텁한", "꺼림한", "꺼무끄름한", "꺼무레한", "꺼무접접한", "꺼뭇꺼뭇한", "꺼뭇한", "꺼벙한", "꺼칠꺼칠한", "꺼칠한", "꺼칫꺼칫한", "꺼칫한", "꺽꺽한", "껄껄한", "껄렁껄렁한", "껄쭉한", "껌껌한", "껑청한", "껑충한", "께끄름한", "께느른한", "께름칙한", "꼬깃꼬깃한", "꼬들꼬들한", "꼬부랑꼬부랑한", "꼬부랑한", "꼬부장한", "꼬불탕꼬불탕한", "꼬장꼬장한", "꼭한", "꼼꼼한", "꼽꼽한", "꼿꼿한", "꽁한", "꽛꽛한", "꾀죄죄한", "꾀죄한", "꾸깃꾸깃한", "꾸덕꾸덕한", "꾸들꾸들한", "꾸부정한", "꾸불꾸불한", "꾸정꾸정한", "꾸준한", "꿈만한", "꿉꿉한", "꿋꿋한", "꿍한", "끄느름한", "끄무레한", "끈끈한", "끈적끈적한", "끈적한", "끌끌한", "끌끔한", "끌밋한", "끔찍끔찍한", "끔찍한", "끼끗한", "끼우뚱끼우뚱한", "끼우뚱한", "나긋나긋한", "나긋한", "나다분한", "나닥나닥한", "나란한", "나른한", "나박한", "나부죽한", "나붓한", "나스르르한", "나슨한", "나슬나슬한", "나약한", "나이브한", "나지막한", "나직나직한", "나직한", "나태한", "낙낙한", "낙락한", "낙락한", "난감한", "난계한", "난괄한", "난란한", "난만한", "난망한", "난분분한", "난삽한", "난언한", "난연한", "난잡한", "난중한", "난지락난지락한", "난처한", "난편한", "난폭한", "난한", "난한", "난해한", "난화한", "날렵한", "날씬한", "날연한", "날짝지근한", "날캉날캉한", "날큰한", "남루한", "남실한", "남짓한", "납작납작한", "납작한", "납죽스름한", "낫낫한", "낭랑한", "낭려한", "낭자한", "낭항한", "내근한", "내명한", "내밀한", "내약한", "내유외강한", "내친한", "냉담한", "냉락한", "냉랭한", "냉엄한", "냉연한", "냉정한", "냉정한", "냉철한", "냉한", "냉혹한", "냠냠한", "너글너글한", "너끈한", "너누룩한", "너더분한", "너덕너덕한", "너덜너덜한", "너무한", "너벳벳한", "너볏한", "너부데데한", "너부렁넓적한", "너부죽한", "너붓한", "너저분한", "너절너절한", "너절한", "너주레한", "넉넉한", "널찍널찍한", "널찍한", "넓적넓적한", "넓적스름한", "넓적한", "넓죽넓죽한", "넓죽한", "넘너른한", "넙데데한", "네모반듯한", "노건한", "노곤한", "노글노글한", "노긋노긋한", "노긋한", "노기충천한", "노닥노닥한", "노둔한", "노르께한", "노르끄름한", "노르스름한", "노르족족한", "노릇노릇한", "노리끼리한", "노리착지근한", "노망한", "노무력한", "노성한", "노쇠한", "노약한", "노작지근한", "노창한", "노폐한", "노혼한", "노활한", "노회한", "노후한", "녹녹한", "녹록한", "녹신녹신한", "녹신한", "녹작지근한", "녹지근한", "녹진녹진한", "놀놀한", "농란한", "농밀한", "농염한", "농후한", "높으락낮으락한", "높지막한", "높직한", "뇌락한", "뇌뢰낙락한", "뇌외한", "누그름한", "누글누글한", "누긋누긋한", "누긋한", "누꿈한", "누렁누렁한", "누르께한", "누르끄레한", "누르뎅뎅한", "누르무레한", "누르스름한", "누르칙칙한", "누르퉁퉁한", "누름한", "누릇누릇한", "누릿한", "누습한", "누지근한", "누추한", "눅눅한", "눅신한", "눅진눅진한", "눅진한", "눈곱만한", "눈곱자기만한", "눌눌한", "눌면한", "눌삽한", "뉘척지근한", "느글느글한", "느긋느긋한", "느긋한", "느끄름한", "느끼한", "느른한", "느리터분한", "느릿느릿한", "느릿한", "느슨한", "느지막한", "느직한", "는질는질한", "늘비한", "늘씬늘씬한", "늘씬한", "늘씬한", "늘쩍지근한", "늘큰한", "늘펀한", "늙수그레한", "늙수레한", "늠름한", "늠연한", "능간한", "능글능글한", "능란한", "능수능란한", "능숙한", "능준한", "능통한", "능한", "니글니글한", "다감한", "다급한", "다기한", "다난한", "다능한", "다다귀다다귀한", "다닥다닥한", "다단한", "다대한", "다락다락한", "다르르한", "다망한", "다망한", "다보록다보록한", "다복한", "다분한", "다붓한", "다뿍한", "다사다난한", "다사다단한", "다사분주한", "다사한", "다소곳한", "다수한", "다습한", "다식한", "다심한", "다예한", "다욕한", "다자손한", "다정다감한", "다정한", "다종다양한", "다죄한", "다직한", "다채한", "다취한", "다행한", "닥작닥작한", "닥지닥지한", "단단한", "단란한", "단려한", "단명한", "단문한", "단소한", "단수한", "단순한", "단아한", "단일한", "단정한", "단정한", "단조한", "단중한", "단천한", "단촉한", "단출한", "단호한", "단후한", "달곰새금한", "달곰쌉쌀한", "달근달근한", "달금한", "달랑달랑한", "달싹한", "달짝지근한", "달착지근한", "달콤한", "달크무레한", "달큼한", "담담한", "담담한", "담대한", "담박한", "담백한", "담뿍담뿍한", "담뿍한", "담상담상한", "담소한", "담숭담숭한", "담탕한", "답답한", "당당한", "당돌한", "당연한", "당한", "대견한", "대공무사한", "대근한", "대길한", "대꾼한", "대단한", "대담무쌍한", "대담한", "대동소이한", "대동한", "대등한", "대문짝만한", "대범한", "대안한", "대점한", "대치한", "댕댕한", "더덕더덕한", "더덜뭇한", "더부룩더부룩한", "더부룩더부룩한", "더부룩한", "더부룩한", "더북한", "더한", "덕적덕적한", "덕지덕지한", "덜름한", "덜한", "덤덤한", "덥수룩한", "덩두렷한", "덩둘한", "덩실한", "데면데면한", "데퉁한", "덴덕지근한", "도담도담한", "도담한", "도도한", "도도한", "도도한", "도돌도돌한", "도랑방자한", "도렷한", "도연한", "도저한", "도톨도톨한", "도톰한", "독공한", "독한", "돈단무심한", "돈독한", "돈목한", "돈후한", "돌돌한", "돌연한", "돌올한", "돌출한", "동그스름한", "동글갸름한", "동글납작한", "동글동글한", "동동촉촉한", "동등한", "동실동실한", "동일한", "동탁한", "동탕한", "되직한", "두두룩두두룩한", "두둑두둑한", "두둑한", "두렷한", "두루뭉술한", "두리두리한", "두리뭉실한", "두리벙한", "두툴두툴한", "두툼한", "둔감한", "둔중한", "둔탁한", "둔팍한", "둔한", "둘한", "둥그스름한", "둥글납작한", "둥글넓적한", "둥글둥글한", "둥글뭉수레한", "둥글번번한", "둥글삐죽한", "둥글한", "둥긋한", "둥실둥실한", "둥실한", "뒤숭숭한", "드문드문한", "드뿍한", "드스한", "득시글한", "득실한", "득의만면한", "득의양양한", "득의연한", "든든한", "든직한", "들썩한", "들쑥날쑥한", "들음직한", "들쩍지근한", "들쭉날쭉한", "들척지근한", "들치근한", "듬뿍듬뿍한", "듬뿍한", "듬성드뭇한", "듬성듬성한", "듬쑥한", "듬쑥한", "듬직한", "등등한", "등한한", "디그르르한", "딩딩한", "따끈따끈한", "따끈한", "따끔따끔한", "따끔한", "따닥따닥한", "따들싹한", "따들싹한", "따듯한", "따뜻한", "따분한", "따사한", "따스한", "딱딱한", "딱한", "딴딴한", "땅딸막한", "땅딸한", "때군때군한", "땡글땡글한", "땡땡한", "떠들썩한", "떠들썩한", "떠름한", "떠지껄한", "떨떠름한", "떨떨한", "떳떳한", "떼꾼떼꾼한", "또렷또렷한", "또렷한", "또박또박한", "똑똑한", "똘똘한", "똘박한", "똥그스름한", "똥똥한", "똥짤막한", "뚜렷한", "뚝뚝한", "뚝한", "뚱글뚱글한", "뚱뚱한", "뚱한", "뜨끈뜨끈한", "뜨끈한", "뜨끔뜨끔한", "뜨끔한", "뜨듯한", "뜨뜻무레한", "뜨뜻미지근한", "뜨뜻한", "뜨르르한", "뜨막한", "뜨문뜨문한", "뜨스한", "뜨악한", "뜨음한", "뜬뜬한", "뜸직뜸직한", "뜸직한", "뜸한", "띄엄띄엄한", "띵띵한", "띵한", "로맨틱한", "리버럴한", "리얼한", "마땅한", "마뜩한", "막강한", "막대한", "막막한", "막막한", "막무가내한", "막심한", "막역한", "막연한", "막중한", "만가한", "만강한", "만건곤한", "만당한", "만만부당한", "만만한", "만만한", "만면한", "만목처량한", "만목황량한", "만무한", "만복한", "만분다행한", "만불근리한", "만사여의한", "만안한", "만안한", "만왕한", "만정한", "만족한", "만좌한", "만질만질한", "만천한", "만화방창한", "말그레한", "말끔한", "말똥말똥한", "말똥한", "말랑말랑한", "말쑥한", "말씬말씬한", "말씬한", "말짱한", "말짱한", "말캉한", "망극한", "망단한", "망막한", "망망한", "망매한", "망솔한", "망연한", "망유기극한", "망중한", "망창한", "망측한", "망패한", "망한", "맞춤한", "매끈둥매끈둥한", "매끈둥한", "매끈매끈한", "매끈한", "매끌매끌한", "매련한", "매매한", "매명한", "매몰한", "매시근한", "매실매실한", "매옴한", "매움한", "매작지근한", "매정한", "매지근한", "매초롬한", "매캐한", "매콤짭짤한", "매콤한", "맥맥한", "맨송맨송한", "맵자한", "맹근한", "맹랑한", "맹렬한", "맹맹한", "맹맹한", "맹한", "맹혹한", "머쓱한", "머츰한", "먹먹한", "먹음직한", "멀끔한", "멀뚱멀뚱한", "멀쑥한", "멀쩡한", "멀찌막한", "멀찍멀찍한", "멀찍한", "멋멋한", "멍청한", "멍한", "메케지근한", "면괴한", "면구한", "면난한", "면면한", "면밀한", "면색여토한", "명결한", "명랑한", "명료한", "명명한", "명미한", "명민한", "명석한", "명실상부한", "명약관화한", "명완한", "명윤한", "명정언순한", "명징한", "명쾌한", "명확한", "모도록한", "모록한", "모호한", "목직한", "몰랑몰랑한", "몰씬몰씬한", "몰씬한", "몰염치한", "몰이해한", "몰인정한", "몰취미한", "몰큰몰큰한", "못마땅한", "못한", "몽글몽글한", "몽글한", "몽땅몽땅한", "몽땅한", "몽똑몽똑한", "몽롱한", "몽몽한", "몽실몽실한", "몽총한", "몽총한", "몽탕몽탕한", "몽탕한", "몽톡한", "묘묘한", "묘연한", "묘한", "무가치한", "무간한", "무감각한", "무감동한", "무감한", "무강한", "무경계한", "무경위한", "무계획한", "무고한", "무고한", "무관계한", "무관심한", "무관한", "무광한", "무교양한", "무구한", "무궁무진한", "무궁한", "무규각한", "무규율한", "무규칙한", "무기력한", "무기한", "무난한", "무념한", "무능력한", "무능한", "무던한", "무덤덤한", "무도막심한", "무도한", "무독한", "무두무미한", "무뚝뚝한", "무량무변한", "무량한", "무력한", "무렴한", "무례한", "무료한", "무류한", "무륜무척한", "무릇한", "무리한", "무맥한", "무맹한", "무명색한", "무모한", "무무한", "무미건조한", "무미한", "무반성한", "무방한", "무법한", "무병한", "무부모한", "무부무군한", "무분별한", "무비한", "무사분주한", "무사안일한", "무사태평한", "무사한", "무사한", "무상한", "무상한", "무색무취한", "무색한", "무색한", "무성격한", "무성의한", "무성한", "무세한", "무소기탄한", "무소부지한", "무소부지한", "무수한", "무시근한", "무시무시한", "무시무종한", "무식한", "무신경한", "무신념한", "무신한", "무심한", "무쌍한", "무안한", "무애한", "무양한", "무언한", "무엄한", "무엇한", "무연한", "무연한", "무욕한", "무용한", "무위한", "무의미한", "무의식한", "무의한", "무익한", "무일푼한", "무자각한", "무자격한", "무자비한", "무작정한", "무작한", "무잡한", "무재무능한", "무재한", "무절조한", "무정견한", "무정처한", "무정한", "무제한한", "무조건한", "무죄한", "무지근한", "무지막지한", "무지몽매한", "무지무지한", "무지한", "무지한", "무지한", "무직한", "무진장한", "무진한", "무질서한", "무차별한", "무참한", "무책임한", "무클한", "무탈한", "무편무당한", "무폐한", "무표정한", "무하한", "무한년한", "무한대한", "무한량한", "무한정한", "무한한", "무항산한", "무해무독한", "무해무득한", "무해한", "무형무적한", "무효한", "무후한", "무흠한", "묵묵한", "묵중한", "묵직묵직한", "묵직한", "문란한", "문명한", "문무겸전한", "문문한", "문아한", "문약한", "물그레한", "물그스름한", "물긋물긋한", "물긋한", "물렁물렁한", "물렁한", "물렴한", "물썽한", "물씬물씬한", "물씬한", "물쩡한", "물컥물컥한", "물컹물컹한", "물한년한", "묽스그레한", "뭉글한", "뭉긋한", "뭉실뭉실한", "뭉실한", "뭉클한", "뭉텅뭉텅한", "뭉텅한", "뭉툭한", "뭐한", "뭣한", "미가신한", "미구한", "미끄덩미끄덩한", "미끄덩한", "미끈둥미끈둥한", "미끈미끈한", "미끈한", "미려한", "미력한", "미련한", "미렷한", "미령한", "미말한", "미묘한", "미미한", "미비한", "미상불연한", "미성숙한", "미세한", "미소한", "미숙한", "미심한", "미안한", "미약한", "미욱한", "미적지근한", "미족한", "미지근한", "미진한", "미천한", "미추룸한", "미타한", "미편한", "미협한", "미흡한", "민감한", "민둥민둥한", "민둥한", "민망한", "민속한", "민숭민숭한", "민완한", "민첩한", "믿음직한", "밀밀한", "밀접한", "밋밋한", "밍근한", "밍근한", "밍밍한", "바드름한", "바듯한", "바람직한", "바룩한", "바삭바삭한", "바스스한", "바지런한", "바특한", "박근한", "박명한", "박문한", "박식한", "박약한", "박절한", "박정한", "박한", "박학다식한", "박흡한", "반드레한", "반드르르한", "반들반들한", "반듯한", "반뜻반뜻한", "반뜻한", "반반가고한", "반반한", "반생반숙한", "반작반작한", "반주그레한", "반지레한", "반지르르한", "반질반질한", "반짝반짝한", "반한", "발가우리한", "발군한", "발그대대한", "발그레한", "발그무레한", "발그스름한", "발그족족한", "발긋발긋한", "발긋한", "발랄한", "발랑발랑한", "발록발록한", "발록한", "발명무로한", "발발한", "발발한", "발자한", "발췌한", "발칙한", "방감한", "방광한", "방달한", "방대한", "방렬한", "방만한", "방불한", "방사한", "방순한", "방약무인한", "방자한", "방정한", "방종한", "방탄한", "방탕한", "배뚜름한", "배리배리한", "배리짝한", "배리착지근한", "배릿배릿한", "배릿한", "배스듬한", "배스름한", "배슥한", "배슷한", "배승한", "배은망덕한", "배주룩배주룩한", "배죽배죽한", "배죽한", "배쭈룩배쭈룩한", "배쭈룩한", "배천한", "백령백리한", "백승한", "백중한", "백해무익한", "뱐주그레한", "버긋한", "버드름한", "버룩한", "버름한", "버서석한", "버스름한", "버슬버슬한", "버슷버슷한", "버썩버썩한", "버썩한", "버젓한", "벅적지근한", "번가한", "번거한", "번극한", "번뇨한", "번다한", "번독한", "번드레한", "번들번들한", "번들한", "번듯한", "번뜻번뜻한", "번뜻한", "번란한", "번무한", "번번한", "번성한", "번쇄한", "번연한", "번영한", "번요한", "번우한", "번잡한", "번장한", "번적번적한", "번족한", "번주그레한", "번지르르한", "번질번질한", "번쩍번쩍한", "번추한", "번한", "번화한", "벋버듬한", "벌그레한", "벌그무레한", "벌그숙숙한", "벌그스름한", "벌그죽죽한", "벌긋벌긋한", "벌렁벌렁한", "벌룩벌룩한", "벌름한", "벌쭉한", "범박한", "범범한", "범상한", "범속한", "범연한", "범용한", "벙긋한", "벙벙한", "벙벙한", "변변한", "변비한", "변화무상한", "변화무쌍한", "별무신통한", "별한", "병약한", "보글보글한", "보독보독한", "보독한", "보동보동한", "보드레한", "보들보들한", "보로통한", "보리퉁한", "보무당당한", "보삭보삭한", "보송보송한", "보송한", "보암직한", "보유스름한", "보잇보잇한", "보잇한", "보편타당한", "복복한", "복슬복슬한", "복잡기괴한", "복잡다기한", "복잡다단한", "복잡한", "본연한", "볼그스름한", "볼긋한", "볼록한", "볼통한", "봉곳봉곳한", "봉곳한", "부다듯한", "부당한", "부대한", "부덕한", "부도덕한", "부도한", "부동한", "부둑부둑한", "부드드한", "부드레한", "부득이한", "부들부들한", "부듯한", "부등한", "부랑무식한", "부루퉁한", "부리부리한", "부미한", "부박한", "부산한", "부석부석한", "부석한", "부성한", "부숭부숭한", "부스스한", "부실한", "부요한", "부유스레한", "부유스름한", "부유한", "부자연한", "부자유한", "부잡한", "부재다언한", "부적격한", "부적당한", "부적절한", "부적한", "부적합한", "부전부전한", "부절제한", "부정당한", "부정직한", "부정한", "부정한", "부정한", "부정한", "부정확한", "부제한", "부조리한", "부조한", "부조한", "부족한", "부주의한", "부지런한", "부진한", "부한", "부허한", "부화방탕한", "부화한", "북실북실한", "분답한", "분란한", "분망한", "분명한", "분방한", "분분한", "분연한", "분운한", "분울한", "분잡한", "분주불가한", "분주한", "분한", "분훤한", "불가근한", "불가능한", "불가부득한", "불가사의한", "불가피한", "불가한", "불가해한", "불건전한", "불견실한", "불결한", "불경한", "불경한", "불공불손한", "불공정한", "불공평한", "불공한", "불과한", "불규칙한", "불균일한", "불균형한", "불그데데한", "불그뎅뎅한", "불그레한", "불그름한", "불그무레한", "불그스레한", "불그스름한", "불그죽죽한", "불긋불긋한", "불긋한", "불긴한", "불길한", "불능한", "불뚝불뚝한", "불뚝한", "불량한", "불룩불룩한", "불룩한", "불륜한", "불리한", "불만족한", "불만한", "불명예한", "불명한", "불명확한", "불목한", "불무한", "불미한", "불민한", "불법한", "불분명한", "불비한", "불빈한", "불상능한", "불상한", "불선명한", "불성실한", "불소한", "불손한", "불숙한", "불순한", "불순한", "불신실한", "불신한", "불쌍한", "불쑥한", "불안불안한", "불안전한", "불안정한", "불안한", "불언가상한", "불여의한", "불연한", "불예한", "불온한", "불완전한", "불요불굴한", "불요불급한", "불요한", "불용한", "불우한", "불원한", "불유쾌한", "불의한", "불이익한", "불일한", "불철저한", "불초한", "불충분한", "불충불의한", "불충실한", "불충한", "불측불효한", "불측한", "불치불검한", "불콰한", "불쾌한", "불투명한", "불퉁한", "불편리한", "불편부당한", "불편한", "불평등한", "불평한", "불필요한", "불학무식한", "불학한", "불합당한", "불합리한", "불합한", "불행한", "불호한", "불확고한", "불확실한", "불확정한", "불효막심한", "불효한", "붕긋붕긋한", "붕긋한", "비감한", "비겁한", "비경한", "비굴한", "비금비금한", "비대한", "비덕한", "비둔한", "비듬한", "비등한", "비딱한", "비뚜름한", "비뚤비뚤한", "비루한", "비륜한", "비리비리한", "비리비리한", "비리쩍한", "비리치근한", "비릿비릿한", "비릿한", "비만한", "비미한", "비미한", "비밀한", "비박한", "비방한", "비범한", "비분한", "비비한", "비상한", "비스듬한", "비스름한", "비슥한", "비습한", "비슷비슷한", "비슷한", "비슷한", "비열한", "비영비영한", "비오한", "비옥한", "비유한", "비윤한", "비일비재한", "비장한", "비절참절한", "비절한", "비정한", "비쭉배쭉한", "비참한", "비창한", "비패한", "비편한", "비하한", "비황한", "빈곤한", "빈궁한", "빈번한", "빈빈한", "빈삭한", "빈약한", "빈핍한", "빈한한", "빠근한", "빠금한", "빠끔한", "빠닥빠닥한", "빠드름한", "빠득빠득한", "빠듯한", "빠릿빠릿한", "빠사삭빠사삭한", "빠사삭한", "빠삭빠삭한", "빠삭한", "빠삭한", "빡빡한", "빡작지근한", "빡지근한", "빤빤한", "빤빤한", "빤작빤작한", "빤지레한", "빤지르르한", "빤질빤질한", "빤한", "빨그댕댕한", "빨그레한", "빨그스레한", "빨그스름한", "빨그족족한", "빨긋빨긋한", "빨긋한", "빨랑빨랑한", "빨쪽빨쪽한", "빨쪽한", "빳빳한", "빵빵한", "빼곡한", "빼꼭한", "빼딱빼딱한", "빼딱한", "빼뚜름한", "빼뚤빼뚤한", "빼빼한", "빼족빼족한", "빼족한", "빼주룩빼주룩한", "빼주룩한", "빼주름한", "빼죽빼죽한", "빼죽한", "빼쪽한", "빼쭈룩빼쭈룩한", "빼쭈룩한", "빼쭉빼쭉한", "빼쭉한", "빽빽한", "뺀뺀한", "뻐근한", "뻐끔뻐끔한", "뻐끔한", "뻐드름한", "뻐득뻐득한", "뻐서석뻐서석한", "뻐서석한", "뻐석뻐석한", "뻐석한", "뻐젓한", "뻑뻑한", "뻑적지근한", "뻑지근한", "뻔드레한", "뻔뻔한", "뻔뻔한", "뻔적뻔적한", "뻔지레한", "뻔지르르한", "뻔질뻔질한", "뻔쩍뻔쩍한", "뻔한", "뻘그데데한", "뻘그레한", "뻘그스름한", "뻘그죽죽한", "뻘긋한", "뻘쭘한", "뻣뻣한", "뻥긋한", "뻥끗한", "뻥한", "뽀글뽀글한", "뽀독뽀독한", "뽀독한", "뽀로통한", "뽀송뽀송한", "뽈그레한", "뽈그스름한", "뽈똑한", "뽈록뽈록한", "뽈록한", "뾰로통한", "뾰롱뾰롱한", "뾰족뾰족한", "뾰족한", "뿌둑뿌둑한", "뿌듯한", "뿌유스름한", "뿔뚝한", "쀼루퉁한", "쀼죽쀼죽한", "쀼죽한", "삐국한", "삐딱한", "삐뚜름한", "삐죽한", "삐쭉한", "삑삑한", "사고무친한", "사곡한", "사근사근한", "사글사글한", "사기왕성한", "사기충천한", "사늘한", "사뜻한", "사번한", "사분사분한", "사세부득이한", "사세부득한", "사소한", "사악한", "사치한", "사탄한", "사특한", "삭막한", "삭연한", "산득한", "산듯한", "산뜻산뜻한", "산뜻한", "산란한", "산만한", "산명수려한", "산산한", "산자수명한", "산적한", "살기충천한", "살뜰한", "살랑한", "살망한", "살벌한", "살살한", "살풍경한", "살핏살핏한", "살핏한", "삼라한", "삼삼한", "삼삼한", "삼삼한", "삼엄한", "삽삽한", "상깃한", "상냥한", "상당한", "상득한", "상등한", "상략한", "상량한", "상막한", "상반한", "상사한", "상세한", "상연한", "상이한", "상적한", "상쾌한", "상큼한", "상활한", "상후하박한", "새곰새곰한", "새들새들한", "새무룩한", "새참한", "새초롬한", "새치름한", "새침한", "새콤달콤한", "새콤한", "새큰새큰한", "새큰한", "샐쭉샐쭉한", "샐쭉한", "생게망게한", "생경한", "생기발랄한", "생동생동한", "생동한", "생뚱한", "생량한", "생생한", "생소한", "생신한", "서근서근한", "서늘한", "서름한", "서먹서먹한", "서먹한", "서부렁한", "서뿐서뿐한", "서서한", "서운한", "석대한", "석연한", "선득선득한", "선득한", "선뜩선뜩한", "선뜩한", "선뜻선뜻한", "선량한", "선려한", "선명한", "선선한", "선연한", "선연한", "선한", "선한", "설뚱한", "설렁한", "설멍한", "설면설면한", "설면한", "설미지근한", "설설한", "설핏한", "섬뜩섬뜩한", "섬뜩한", "섬부한", "섬서한", "섬섬한", "섬세한", "섬소한", "섬약한", "섬연한", "섬쩍지근한", "섭섭한", "성결한", "성근한", "성급한", "성깃성깃한", "성대한", "성성한", "성숙한", "성실한", "성큼한", "성풍한", "성한", "성한", "세미한", "세밀한", "세부득이한", "세세한", "세쇄한", "세심한", "세장한", "섹시한", "소곳한", "소광한", "소담한", "소도록한", "소득소득한", "소들소들한", "소락소락한", "소란한", "소략한", "소려한", "소루한", "소명한", "소박한", "소방한", "소보록한", "소복소복한", "소복한", "소빈한", "소삭한", "소삽한", "소삽한", "소상분명한", "소상한", "소소한", "소소한", "소소한", "소스락소스락한", "소슬한", "소심익익한", "소심한", "소연한", "소연한", "소연한", "소원한", "소저한", "소적한", "소조한", "소졸한", "소중한", "소탈한", "소홀한", "속악한", "속한", "손열한", "솔깃한", "솔직한", "송골송골한", "송구한", "송송한", "쇄락한", "쇠곤한", "쇠미한", "쇠약한", "쇠양배양한", "쇰직한", "수걸한", "수굿수굿한", "수굿한", "수다한", "수더분한", "수두룩한", "수려한", "수령한", "수발한", "수북수북한", "수북한", "수삽한", "수상한", "수선수선한", "수선한", "수월수월한", "수월한", "수참한", "수척한", "수통한", "숙살한", "숙성한", "숙숙한", "숙엄한", "숙연한", "숙정한", "숙지근한", "숙친한", "순결무구한", "순결한", "순고한", "순근한", "순당한", "순란한", "순량한", "순량한", "순량한", "순량한", "순명한", "순미한", "순미한", "순박한", "순수한", "순순한", "순순한", "순실한", "순연한", "순일한", "순전한", "순정한", "순지한", "순직한", "순직한", "순진한", "순탄한", "순편한", "순평한", "순한", "순후한", "숭굴숭굴한", "숭숭한", "숱한", "쉬지근한", "스산한", "습습한", "습윤한", "습한", "승평한", "승한", "시굼시굼한", "시그무레한", "시근한", "시금떨떨한", "시금털털한", "시금한", "시급한", "시기적절한", "시끌시끌한", "시드럭부드럭한", "시들먹한", "시들한", "시릿한", "시무룩한", "시쁘둥한", "시쁘장한", "시시껄렁한", "시시콜콜한", "시시한", "시원섭섭한", "시원시원한", "시원한", "시의적절한", "시장한", "시종여일한", "시지근한", "시치름한", "시쿰시쿰한", "시쿰한", "시크무레한", "시큰둥한", "시큰한", "시큼시큼한", "시큼한", "시퉁한", "시틋한", "식상한", "신기한", "신기한", "신랄한", "신명한", "신묘한", "신밀한", "신밀한", "신비한", "신산한", "신선한", "신성한", "신속한", "신실한", "신이한", "신중한", "신출귀몰한", "신통방통한", "신통한", "신효한", "실긋샐긋한", "실기죽한", "실뚱머룩한", "실미적지근한", "실미지근한", "실쭉한", "실한", "심각한", "심대한", "심대한", "심드렁한", "심란한", "심무소주한", "심상한", "심심한", "심심한", "심심한", "심악한", "심약한", "심원한", "심장한", "심절한", "심중한", "심한", "심험한", "싱숭생숭한", "싱싱한", "싸늘한", "싸한", "싹둑싹둑한", "싹싹한", "쌀랑쌀랑한", "쌀랑한", "쌀쌀한", "쌈박한", "쌉싸래한", "쌉쌀한", "쌍절한", "쌜긋쌜긋한", "쌜긋한", "쌜기죽한", "쌜쭉쌜쭉한", "쌜쭉한", "쌩쌩한", "쌩한", "써늘한", "썩썩한", "썰겅썰겅한", "썰렁썰렁한", "썰렁한", "썰컹썰컹한", "쏠쏠한", "쑬쑬한", "쑬한", "쓰렁쓰렁한", "쓸쓸한", "씁쓰레한", "씁쓰름한", "씁쓸한", "씨그둥한", "씨무룩한", "씨억씨억한", "씩씩한", "씰긋쌜긋한", "씰긋씰긋한", "씰긋한", "씰기죽한", "씽씽한", "아긋한", "아기자기한", "아늑한", "아담한", "아당한", "아둔한", "아드막한", "아득아득한", "아득한", "아뜩아뜩한", "아뜩한", "아련한", "아렴풋한", "아르르한", "아리딸딸한", "아리송한", "아리아리한", "아리잠직한", "아릿자릿한", "아릿한", "아마득한", "아무러한", "아삼아삼한", "아스라한", "아슬아슬한", "아슬한", "아슴푸레한", "아이로니컬한", "아찔아찔한", "아찔한", "아한", "악덕한", "악독한", "악랄한", "악연한", "악착한", "악한", "안가한", "안강한", "안고수비한", "안고한", "안녕한", "안락한", "안비막개한", "안상한", "안온한", "안이한", "안일한", "안전한", "안정한", "안존한", "안퐁한", "안한한", "알근달근한", "알근알근한", "알근한", "알금삼삼한", "알끈한", "알딸딸한", "알뜰살뜰한", "알뜰한", "알라꿍달라꿍한", "알락달락한", "알량꼴량한", "알량한", "알록달록한", "알롱달롱한", "알롱알롱한", "알삽한", "알싸한", "알쏭달쏭한", "알쏭알쏭한", "알쏭한", "알알한", "알연한", "알짝지근한", "암담한", "암암한", "암암한", "암암한", "암연한", "암우한", "암울한", "앙가조촘한", "앙당한", "앙똥한", "앙바틈한", "앙상한", "앙앙한", "앙연한", "앙장한", "앙증한", "앙큼한", "앙한", "애련한", "애루한", "애리애리한", "애리한", "애매모호한", "애매한", "애매한", "애민한", "애석한", "애석한", "애애한", "애애한", "애애한", "애애한", "애연한", "애연한", "애옥한", "애잔한", "애절한", "애절한", "애중한", "애참한", "애통망극한", "애통한", "애틋한", "액색한", "앰한", "앵한", "야드르르한", "야드를한", "야들야들한", "야들한", "야릇한", "야리야리한", "야매한", "야박한", "야비한", "야쁘장한", "야속한", "야심만만한", "야심한", "야젓한", "야트막한", "야틈한", "야한", "야한", "약간한", "약소한", "약소한", "약약한", "약여한", "약한", "얄브스름한", "얄캉한", "얄팍얄팍한", "얄팍한", "얌전한", "얍삽한", "양명한", "양명한", "양순한", "양양한", "양양한", "양호한", "어근버근한", "어글어글한", "어금버금한", "어금지금한", "어긋한", "어눌한", "어두침침한", "어두컴컴한", "어둑어둑한", "어둔한", "어둔한", "어둠침침한", "어득한", "어떠어떠한", "어떠한", "어뜩비뜩한", "어뜩어뜩한", "어뜩한", "어런더런한", "어련무던한", "어련한", "어렴풋한", "어령칙한", "어루룩더루룩한", "어루숭어루숭한", "어룽어룽한", "어룽어룽한", "어리둥절한", "어리벙벙한", "어리빙빙한", "어리삥삥한", "어리숙한", "어리숭한", "어리어리한", "어리어리한", "어릿어릿한", "어릿어릿한", "어릿한", "어마어마한", "어마한", "어벙한", "어상반한", "어색한", "어석버석한", "어성버성한", "어수룩한", "어수선산란한", "어수선한", "어스레한", "어슬한", "어슴푸레한", "어슷비슷한", "어슷한", "어연간한", "어연번듯한", "어엿한", "어웅한", "어정쩡한", "어중간한", "어지간한", "어질더분한", "어질어질한", "어찔어찔한", "어찔한", "어푸수수한", "억분한", "억색한", "억실억실한", "억울한", "억원한", "억한", "언거번거한", "언건한", "언순이정한", "언정이순한", "언죽번죽한", "언중한", "언틀먼틀한", "얼근얼근한", "얼근한", "얼금숨숨한", "얼기설기한", "얼떨떨한", "얼떨한", "얼럭덜럭한", "얼루룽덜루룽한", "얼룩덜룩한", "얼룩얼룩한", "얼룽덜룽한", "얼멍덜멍한", "얼멍얼멍한", "얼쑹얼쑹한", "얼얼한", "얼울한", "얼쩍지근한", "얼쩡한", "얼큰한", "얼키설키한", "얽둑얽둑한", "얽적얽적한", "얽죽얽죽한", "엄격한", "엄렬한", "엄명한", "엄밀한", "엄벙한", "엄부렁한", "엄숙한", "엄엄한", "엄엄한", "엄연한", "엄위한", "엄장한", "엄전한", "엄절한", "엄정한", "엄준한", "엄중한", "엄한", "엄혹한", "엇구수한", "엇비스듬한", "엇비슥한", "엇비슷한", "엉거주춤한", "엉기성기한", "엉뚱한", "엉성한", "엉큼한", "에구붓한", "에넘느레한", "에푸수수한", "엔간한", "여간한", "여광여취한", "여구한", "여낙낙한", "여류한", "여릿여릿한", "여릿한", "여범인동한", "여법한", "여북한", "여사여사한", "여사한", "여신한", "여유작작한", "여의한", "여일한", "여전한", "여차한", "여취여광한", "여타자별한", "여한", "여하한", "여형약제한", "역강한", "역력한", "역부족한", "역연한", "역한", "연구월심한", "연로한", "연만한", "연면한", "연부역강한", "연삭삭한", "연상약한", "연소기예한", "연소한", "연숙한", "연안한", "연약한", "연연한", "연연한", "연연한", "연연한", "연천한", "연한", "열등한", "열렬한", "열세한", "열약한", "열요한", "열하한", "열협한", "염개한", "염검한", "염결한", "염명한", "염백한", "염아한", "염염한", "염염한", "염정한", "염직한", "염한", "엽렵한", "엽엽한", "영걸한", "영검한", "영구불변한", "영구한", "영귀한", "영독한", "영롱한", "영리한", "영매한", "영맹한", "영명한", "영명한", "영민한", "영성한", "영성한", "영세한", "영세한", "영실한", "영악한", "영영무궁한", "영영한", "영영한", "영오한", "영오한", "영용무쌍한", "영원무궁한", "영윤한", "영이한", "영이한", "영준한", "영통한", "영특한", "영특한", "영한", "영험한", "예리한", "예민한", "예쁘장한", "예철한", "오글쪼글한", "오긋한", "오돌오돌한", "오동통한", "오동포동한", "오뚝한", "오롯한", "오만무도한", "오만무례한", "오만불손한", "오만한", "오목오목한", "오목조목한", "오묘한", "오밀조밀한", "오보록한", "오복한", "오붓한", "오사바사한", "오색찬란한", "오손도손한", "오순도순한", "오종종한", "오죽한", "오톨도톨한", "오활한", "옥실옥실한", "온건한", "온공한", "온난한", "온당한", "온량한", "온순한", "온순한", "온아적정한", "온아한", "온온한", "온유한", "온인한", "온자한", "온자한", "온전한", "온편한", "온한", "온화한", "온화한", "온후한", "올긋볼긋한", "올똑볼똑한", "올록볼록한", "올막졸막한", "올망졸망한", "올올한", "옴쏙옴쏙한", "옴팡한", "옴폭옴폭한", "옴폭한", "옹긋옹긋한", "옹긋쫑긋한", "옹기종기한", "옹색한", "옹송망송한", "옹졸한", "와그르르한", "왁달박달한", "왁자그르르한", "왁자지껄한", "왁자한", "완강한", "완강한", "완고한", "완고한", "완곡한", "완곡한", "완구한", "완둔한", "완려한", "완루한", "완만한", "완만한", "완명한", "완미한", "완벽한", "완숙한", "완숙한", "완실한", "완약한", "완연한", "완연한", "완완한", "완전무결한", "완전한", "완패한", "왈왈한", "왈칵한", "왕망한", "왕성한", "왕약한", "왕연한", "왕왕한", "왜곡한", "왜루한", "왜소한", "왜자한", "외람한", "외무주장한", "외월한", "요긴한", "요나한", "요란뻑적지근한", "요란한", "요량한", "요러요러한", "요령부득한", "요마한", "요만조만한", "요만한", "요망한", "요악한", "요연한", "요연한", "요염한", "요요한", "요요한", "요원한", "요조한", "요족한", "요철한", "용감무쌍한", "용감한", "용렬한", "용맹무쌍한", "용맹한", "용용한", "용의주도한", "용이한", "용퉁한", "용한", "용한", "용혹무괴한", "우곡한", "우그렁우그렁한", "우그렁쭈그렁한", "우그렁한", "우그르르한", "우긋우긋한", "우긋한", "우긋한", "우둔한", "우둘우둘한", "우둥퉁한", "우등한", "우뚝우뚝한", "우뚝한", "우락부락한", "우람한", "우람한", "우량한", "우렁우렁한", "우루한", "우매한", "우몽한", "우묘한", "우묵우묵한", "우묵주묵한", "우묵한", "우미한", "우부룩한", "우북수북한", "우북한", "우분한", "우불꾸불한", "우비한", "우상한", "우선한", "우세한", "우소한", "우수한", "우수한", "우순풍조한", "우승한", "우심한", "우아한", "우악한", "우악한", "우연만한", "우연한", "우열한", "우울한", "우원한", "우월한", "우유부단한", "우중충한", "우직한", "우툴두툴한", "우툴우툴한", "우후한", "욱복한", "욱욱청청한", "운수불행한", "운아한", "울가망한", "울근불근한", "울뚝불뚝한", "울룩불룩한", "울멍줄멍한", "울묵줄묵한", "울민한", "울밀한", "울분한", "울불한", "울연한", "울연한", "울울불락한", "울울한", "울적한", "울창한", "울퉁불퉁한", "움쑥한", "움퍽한", "움푹움푹한", "움푹한", "웅건한", "웅걸한", "웅경한", "웅긋중긋한", "웅대한", "웅신한", "웅용한", "웅위한", "웅장한", "웅혼한", "워그르르한", "원굴한", "원대한", "원만한", "원숙한", "원억한", "원원한", "원융한", "원통한", "원활한", "월등한", "웬만한", "위곡한", "위급한", "위대한", "위독한", "위름한", "위박한", "위의당당한", "위의한", "위중한", "위태위태한", "위태한", "위풍당당한", "위험천만한", "위험한", "위효한", "유감한", "유감한", "유고한", "유공한", "유관한", "유구한", "유권력한", "유능한", "유독한", "유들유들한", "유량한", "유려한", "유력한", "유리한", "유망한", "유명무실한", "유명한", "유별한", "유사한", "유세한", "유소문한", "유순한", "유습한", "유시한", "유식한", "유심한", "유아한", "유야무야한", "유약한", "유약한", "유여한", "유여한", "유연한", "유연한", "유연한", "유용한", "유원한", "유원한", "유위부족한", "유유한", "유유한", "유의한", "유이한", "유익한", "유일한", "유자유손한", "유장한", "유적한", "유정한", "유정한", "유조한", "유족한", "유족한", "유종한", "유주무량한", "유주한", "유착한", "유창한", "유충한", "유치찬란한", "유치한", "유쾌한", "유표한", "유한", "유한한", "유해무익한", "유해한", "유형무형한", "유형한", "유효적절한", "유효한", "육중한", "윤당한", "윤택한", "윤환한", "융숭한", "으리으리한", "으스름한", "으스스한", "으쓱으쓱한", "으쓱한", "은근한", "은미한", "은밀한", "은성한", "은연한", "은은한", "은은한", "은진한", "은풍한", "음흉한", "응당한", "의구한", "의기소침한", "의기양양한", "의기충천한", "의당한", "의뭉한", "의미심장한", "의미한", "의수한", "의아한", "의연한", "의의한", "의젓한", "의합한", "의협한", "이드르르한", "이들이들한", "이러이러한", "이러저러한", "이러한", "이렁성저렁성한", "이마마한", "이만한", "이상야릇한", "이상한", "이슥한", "이심한", "이악한", "이여이한", "이한", "익숙한", "인색한", "인서한", "인자한", "인희지광한", "일거무소식한", "일견여구한", "일구한", "일긴한", "일난풍화한", "일망무제한", "일목요연한", "일문불통한", "일사불란한", "일소한", "일안한", "일정한", "일천한", "일희일비한", "임록한", "임리한", "임림총총한", "잉편한", "자그마한", "자긋자긋한", "자랑자랑한", "자르르한", "자름한", "자리자리한", "자릿자릿한", "자릿한", "자명한", "자몽한", "자별한", "자분자분한", "자비한", "자빠름한", "자상한", "자세한", "자심한", "자약한", "자연한", "자오록한", "자옥한", "자우룩한", "자욱한", "자유분방한", "자유자재한", "자자한", "자작한", "자잘한", "자재한", "자족한", "자질자질한", "자차분한", "작달막한", "잔득한", "잔망한", "잔미한", "잔악한", "잔약한", "잔열한", "잔원한", "잔인무도한", "잔인한", "잔잔한", "잔졸한", "잔풍한", "잔학한", "잔혹한", "잘똑잘똑한", "잘록한", "잘박잘박한", "잘쏙잘쏙한", "잘파닥잘파닥한", "잘팍한", "잠잠한", "잡다한", "잡박한", "장걸한", "장근한", "장대한", "장대한", "장려한", "장렬한", "장엄한", "장원한", "장장한", "장절한", "장중한", "장쾌한", "장태평한", "장한", "장한", "장한한", "장한한", "장황한", "잦바듬한", "재깔한", "재둔한", "재민한", "재부족한", "재재한", "쟁글쟁글한", "쟁쟁한", "쟁쟁한", "저급한", "저대한", "저렴한", "저릿저릿한", "저릿한", "저만한", "저명한", "저명한", "저속한", "저어한", "저열한", "저조한", "적격한", "적나라한", "적당한", "적력한", "적료한", "적막한", "적법한", "적빈한", "적실한", "적연한", "적연한", "적요한", "적의한", "적적한", "적절한", "적정한", "적족한", "적중한", "적합한", "적확한", "전능한", "전도요원한", "전등한", "전무한", "전무후무한", "전성한", "전지전능한", "절가한", "절교한", "절급한", "절긴한", "절대한", "절등한", "절륜한", "절묘한", "절무한", "절박한", "절분한", "절세한", "절실한", "절요한", "절원한", "절절한", "절친한", "절통한", "절한", "절험한", "절호한", "절후한", "점점한", "점직한", "점한", "정갈한", "정강한", "정강한", "정결한", "정결한", "정결한", "정고한", "정교한", "정근한", "정녕한", "정당한", "정당한", "정대한", "정렬한", "정묘한", "정미한", "정밀한", "정밀한", "정백한", "정세한", "정쇄한", "정수한", "정숙한", "정숙한", "정숙한", "정숙한", "정심한", "정약한", "정연한", "정연한", "정정당당한", "정정한", "정제한", "정중한", "정직한", "정한", "정한", "정확한", "제제한", "조글조글한", "조급한", "조략한", "조련한", "조롱조롱한", "조릿조릿한", "조마조마한", "조만조만한", "조만한", "조민한", "조밀한", "조붓한", "조속한", "조숙한", "조신한", "조악한", "조악한", "조야한", "조요한", "조용조용한", "조용한", "조잔한", "조잡한", "조촐한", "조한", "족족한", "족한", "존대한", "존득존득한", "존엄한", "존절한", "존존한", "존중한", "졸깃졸깃한", "졸딱졸딱한", "졸렬한", "졸속한", "졸연한", "졸한", "좀한", "종용한", "종종한", "죄송한", "주글주글한", "주도면밀한", "주도한", "주렁주렁한", "주르르한", "주밀한", "주밀한", "주절주절한", "준급한", "준득준득한", "준수한", "준엄한", "준열한", "준적한", "준절한", "준초한", "줄느런한", "중난한", "중대한", "중씰한", "중악한", "중요한", "중중첩첩한", "중탁한", "중한", "중후한", "쥐방울만한", "즐번한", "즐비한", "지건한", "지격한", "지결한", "지공무사한", "지광인희한", "지교한", "지궁한", "지극한", "지긋지긋한", "지긋한", "지긋한", "지꺼분한", "지껄한", "지난한", "지당한", "지대한", "지독한", "지둔한", "지런지런한", "지루한", "지룩한", "지르르한", "지르르한", "지르퉁한", "지만의득한", "지망지망한", "지묘한", "지빈한", "지순한", "지악한", "지엄한", "지완한", "지원극통한", "지자한", "지저분한", "지적지적한", "지절한", "지존한", "지지한", "지지한", "지직한", "지질구질한", "지질펀펀한", "지질한", "지친한", "지통한", "지헐한", "직실한", "직절한", "직한", "진기한", "진득진득한", "진득한", "진물진물한", "진보한", "진부한", "진솔한", "진실한", "진정한", "진중한", "진중한", "진지한", "진진한", "진한", "질구한", "질깃질깃한", "질깃한", "질둔한", "질박한", "질버덕질버덕한", "질벅한", "질번질번한", "질소한", "질실한", "질척한", "질탕한", "질퍼덕한", "질퍽질퍽한", "질펀한", "짐짐한", "집요한", "징건한", "징글징글한", "짜랑짜랑한", "짜랑한", "짜르르한", "짜름한", "짜릿짜릿한", "짜릿한", "짜한", "짝자그르한", "짠득한", "짠한", "짤록한", "짤막짤막한", "짤막한", "짭조름한", "짭짜름한", "짭짤한", "짱짱한", "째긋한", "쨍쨍한", "쨍한", "쩌렁쩌렁한", "쩌릿쩌릿한", "쩌릿한", "쩝쩔한", "쩡쩡한", "쩡한", "쩨쩨한", "쪼글쪼글한", "쪼르르한", "쪼잔한", "쫀쫀한", "쫄깃쫄깃한", "쫄깃한", "쫑긋쫑긋한", "쫑긋한", "쭈글쭈글한", "쭈뼛쭈뼛한", "쭈뼛한", "쭝긋쭝긋한", "쭝긋한", "찌그둥한", "찌꺼분한", "찌르르한", "찌릿찌릿한", "찌릿한", "찌뿌둥한", "찌뿌드드한", "찌뿌듯한", "찐득찐득한", "찐득한", "찔깃찔깃한", "찔깃한", "찜찜한", "찝찔한", "찝찝한", "찡찡한", "찡한", "차근차근한", "차근한", "차끈한", "차란차란한", "차랑한", "차분차분한", "차분한", "차악한", "착란한", "착박한", "착실한", "착잡한", "착착한", "착한", "찬란한", "찬엄한", "찬연한", "찬찬한", "찬찬한", "찰람한", "찰랑찰랑한", "찰랑한", "참담한", "참란한", "참람한", "참암한", "참절한", "참착한", "참치한", "참한", "찹찹한", "창고한", "창대한", "창망한", "창명한", "창백한", "창암한", "창연한", "창연한", "창연한", "창졸한", "창창울울한", "창창한", "창천한", "창취한", "창쾌한", "창평한", "창피한", "창한", "창황망조한", "창황한", "창황한", "처량한", "처연한", "처염한", "처절한", "처절한", "처참한", "처창한", "처처한", "척박한", "척척한", "천만다행한", "천만부당한", "천미한", "천박한", "천박한", "천부당만부당한", "천부당한", "천속한", "천연한", "천은망극한", "천의무봉한", "천진무구한", "천진한", "천착한", "천한", "철두철미한", "철렁한", "철면피한", "철벅한", "철저한", "첨예한", "첩첩한", "청결한", "청고한", "청랑한", "청랑한", "청량한", "청렴결백한", "청렴한", "청명한", "청백한", "청빈한", "청수한", "청아한", "청정한", "청처짐한", "청청한", "청청한", "청초한", "청쾌한", "청한한", "청화한", "체소한", "체체한", "초간한", "초급한", "초라한", "초롱초롱한", "초범한", "초솔한", "초실한", "초연한", "초원한", "초조한", "초창한", "초초한", "초초한", "초췌한", "초협한", "촉급한", "촉박한", "촉촉한", "촉한", "촉한", "촐촐한", "촘촘한", "총명한", "총민한", "총요한", "총잡한", "총총한", "총총한", "총총한", "총총한", "총혜한", "최귀한", "최요한", "최친한", "추근추근한", "추레한", "추루한", "추비한", "추잡한", "추저분한", "추접지근한", "추접한", "추졸한", "추추한", "추한", "축축한", "출무성한", "출중한", "출출한", "충당한", "충량한", "충만한", "충분한", "충순한", "충실한", "충실한", "충연한", "충족한", "충직한", "충충한", "취약한", "측측한", "치근치근한", "치런치런한", "치렁치렁한", "치면한", "치밀한", "치사한", "치열한", "치졸한", "치지한", "치평한", "칙칙한", "친근한", "친목한", "친밀한", "친선한", "친숙한", "친압한", "친절한", "친친한", "친한", "친호한", "친후한", "친흡한", "칠럼한", "칠칠한", "침울한", "침잠한", "침적한", "침중한", "침착한", "침침한", "침통한", "침후한", "칭당한", "칭직한", "카랑카랑한", "카랑카랑한", "카랑한", "칼칼한", "캄캄한", "컬러풀한", "컬컬한", "컴컴한", "코믹한", "쾌락한", "쾌심한", "쾌연한", "쾌적한", "쾌청한", "쾌쾌한", "쾌한", "쾌활한", "쾌활한", "쿨렁쿨렁한", "퀭한", "퀴퀴한", "클클한", "큼지막한", "큼직큼직한", "큼직한", "타기만만한", "타당한", "타박한", "타분한", "타이트한", "탁락한", "탁원한", "탁월한", "탁탁한", "탁한", "탄탄한", "탄탄한", "탐린한", "탐오한", "탐탁한", "탑소록한", "탑탑한", "탕연한", "탕일한", "탕탕한", "탕평한", "태과한", "태다한", "태만한", "태무심한", "태무한", "태부족한", "태심한", "태안한", "태연자약한", "태연한", "태평한", "탱글탱글한", "탱중한", "탱탱한", "터분한", "터실터실한", "털털한", "텁텁한", "토박한", "토실토실한", "토옥한", "톡톡한", "통렬한", "통분한", "통석한", "통속한", "통창한", "통쾌한", "통통한", "통한한", "투명한", "투미한", "투박한", "투실한", "투지만만한", "투철한", "툭툭한", "툭한", "툽툽한", "툽툽한", "퉁명한", "퉁퉁한", "트릿한", "트적지근한", "특별한", "특수한", "특수한", "특유한", "특이한", "특정한", "특출한", "튼실한", "튼튼한", "팅팅한", "파다한", "파렴치한", "파르스름한", "파름파름한", "파릇파릇한", "파릇한", "파리한", "파삭한", "팍삭한", "팍신팍신한", "팍팍한", "판연한", "판이한", "판판한", "팔초한", "패둥패둥한", "패려한", "패례한", "패리한", "패악한", "패연한", "팽만한", "팽팽한", "팽팽한", "팽한", "퍼르무레한", "퍼석퍼석한", "퍼석한", "퍼슬퍼슬한", "퍽신퍽신한", "퍽신한", "퍽퍽한", "펀펀한", "펄펄한", "펑퍼짐한", "편근한", "편녕한", "편리한", "편만한", "편벽한", "편안한", "편익한", "편중한", "편한", "편협한", "평강한", "평담한", "평등무차별한", "평등한", "평범한", "평심한", "평안한", "평온무사한", "평온한", "평이한", "평정한", "평탄한", "평편한", "평평한", "평행한", "평화한", "평활한", "평활한", "포근한", "포실한", "포악한", "포족한", "포학무도한", "포학한", "폭려한", "폭삭폭삭한", "폭삭한", "폭신폭신한", "폭신한", "표독한", "표리부동한", "표묘한", "표연한", "표표한", "표한한", "푸근푸근한", "푸근한", "푸둥푸둥한", "푸르께한", "푸르데데한", "푸르뎅뎅한", "푸르무레한", "푸르죽죽한", "푸릇한", "푸만한", "푸석푸석한", "푸석푸석한", "푸석한", "푸수수한", "푸슬푸슬한", "푸시시한", "푸짐한", "푸한", "푹석푹석한", "푹석한", "푹신푹신한", "푹신한", "푹한", "푼더분한", "푼푼한", "풋풋한", "풍려한", "풍만한", "풍부한", "풍성풍성한", "풍성한", "풍신한", "풍아한", "풍염한", "풍요한", "풍유한", "풍족한", "풍후한", "피곤한", "피둥피둥한", "피로한", "필연한", "필요한", "핍박한", "핍진한", "핑핑한", "하고한", "하늘하늘한", "하들하들한", "하르르한", "하박하박한", "하야말쑥한", "하야스름한", "하여한", "하염직한", "하전한", "하천한", "한가한", "한랭한", "한료한", "한만한", "한만한", "한미한", "한빈한", "한산한", "한심한", "한아한", "한유한", "한적한", "함초롬한", "함치르르한", "함함한", "합당한", "항구한", "해괴망측한", "해괴한", "해끄무레한", "해끔한", "해끔해끔한", "해끗한", "해말끔한", "해발쪽한", "해사한", "해쓱한", "해이한", "해정한", "해참한", "해패한", "행복한", "향긋한", "향암한", "허구한", "허다한", "허랑방탕한", "허령불매한", "허룩한", "허름한", "허망한", "허무한", "허소한", "허수한", "허술한", "허심탄회한", "허심한", "허여멀쑥한", "허여스름한", "허엽스레한", "허전한", "허전허전한", "허출한", "허탄한", "허탈한", "허한", "허허한", "허황한", "헌앙한", "헌창한", "헌칠민틋한", "헌칠한", "헐렁한", "헐렁헐렁한", "헐한", "헐후한", "험난한", "험상한", "험악한", "험요한", "험한", "헙수룩한", "헙헙한", "헛헛한", "헤갈한", "헤벌쭉한", "헤싱헤싱한", "헬렐레한", "혁혁한", "혁혁한", "현격한", "현란한", "현량한", "현명한", "현숙한", "현연한", "현연한", "현요한", "현저한", "현준한", "현철한", "현황한", "혈혈무의한", "혈혈한", "협량한", "협소한", "협애한", "협착한", "형사한", "형철한", "형형한", "호담한", "호대한", "호도한", "호락호락한", "호리한", "호리호리한", "호무한", "호장한", "호젓한", "호졸근한", "호탕한", "호탕한", "호협한", "호호탕탕한", "호호한", "호화찬란한", "호활한", "혹독한", "혹사한", "혹심한", "혼곤한", "혼돈한", "혼란한", "혼란한", "혼매한", "혼미한", "혼암한", "혼연한", "혼잡한", "혼탁한", "혼혼한", "혼후한", "홀가분한", "홀연한", "홀쭉한", "홀쭉홀쭉한", "홀한", "홀홀한", "홈홈한", "홋홋한", "홍원한", "화급한", "화기애애한", "화길한", "화끈한", "화끈화끈한", "화난한", "화락한", "화려한", "화목한", "화발허통한", "화사한", "화섬한", "화순한", "화창한", "화통한", "화평한", "화한", "화한", "확고부동한", "확고한", "확실한", "확연한", "확적한", "확호불발한", "환한", "활달한", "활발한", "활수한", "활협한", "홧홧한", "황감한", "황겁한", "황공무지한", "황공한", "황괴한", "황급한", "황당무계한", "황당한", "황량한", "황막한", "황망한", "황무한", "황송무지한", "황송한", "황연한", "황탄한", "황포한", "황홀난측한", "황홀한", "황황급급한", "황황한", "황황한", "횅댕그렁한", "횅한", "회홍한", "회확한", "횡포한", "효박한", "후끈한", "후끈후끈한", "후더분한", "후덥지근한", "후련한", "후리후리한", "후리후리한", "후안무치한", "후줄근한", "후출한", "후터분한", "후한", "후회막급한", "후회막심한", "훈증한", "훈훈한", "훈훈한", "훌렁한", "훌렁훌렁한", "훌륭한", "훌쩍한", "훌쩍훌쩍한", "훌쭉한", "훌쭉훌쭉한", "훗훗한", "훤소한"};

    public static String getRandomAdjective() {
        String adj = adjectives[(int) (Math.random() * adjectives.length)];
        while (adj.length() > 5) {
            adj = adjectives[(int) (Math.random() * adjectives.length)];
        }
        return adj;
    }
}
