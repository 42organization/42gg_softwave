import React, { useMemo } from 'react';
import { useRecoilValue, useRecoilState, useSetRecoilState } from 'recoil';
import { MatchMode } from 'types/mainType';
import { Slot } from 'types/matchTypes';
import { liveState } from 'utils/recoil/layout';
import { modalState } from 'utils/recoil/modal';
import { currentMatchState } from 'utils/recoil/match';
import styles from 'styles/match/MatchSlot.module.scss';
import instance from '../../utils/axios';
import { errorState } from '../../utils/recoil/error';

interface MatchSlotProps {
  type: string;
  slot: Slot;
  checkBoxMode?: MatchMode;
}

function MatchSlot({ type, slot, checkBoxMode }: MatchSlotProps) {
  const setError = useSetRecoilState(errorState);
  const setModal = useSetRecoilState(modalState);
  const [currentMatch] = useRecoilState(currentMatchState);
  const { event } = useRecoilValue(liveState);
  const { headCount, slotId, status, mode } = slot;
  const headMax = type === 'single' ? 2 : 4;
  const buttonStyle: { [key: string]: string } = useMemo(
    () => ({
      mytable: checkBoxMode === mode ? styles.my : styles.disabled,
      close: styles.disabled,
      open: checkBoxMode === 'rank' ? styles.rank : styles.normal,
    }),
    [slot]
  );

  const challengeSlotEnroll = async () => {
    try {
      const body = { slotId: slotId, mode: mode, opponent: null };
      await instance.post(`/pingpong/match/tables/${1}/${type}`, body);
    } catch (e: any) {
      setError('RJ02');
    }
  };

  const enrollHandler = async () => {
    if (status === 'mytable') {
      setModal({
        modalName: 'MATCH-CANCEL',
        cancel: {
          slotId: currentMatch.slotId,
        },
      });
    } else if (event === 'match') {
      setModal({ modalName: 'MATCH-REJECT' });
    } else if (checkBoxMode === 'challenge') {
      await challengeSlotEnroll();
      setModal({
        modalName: 'MATCH-CHALLENGE',
        challenge: {
          slotId,
          type,
          mode: checkBoxMode,
        },
      });
    } else {
      setModal({
        modalName: 'MATCH-ENROLL',
        enroll: {
          slotId,
          type,
          mode: checkBoxMode,
        },
      });
    }
  };

  return (
    <button
      className={`${styles.slotButton} ${buttonStyle[status]}`}
      disabled={status === 'close'}
      onClick={enrollHandler}
    >
      <span className={styles.slotId}>
        {slotId}
        {status === 'mytable' && ' 🙋'}
      </span>
      <span className={`${styles.headCount} ${headCount === 0 && styles.plus}`}>
        {headCount === 0 ? '+' : `${headCount}/${headMax}`}
      </span>
    </button>
  );
}

export default React.memo(MatchSlot);
