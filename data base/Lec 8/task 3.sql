SELECT *
FROM JOB_HISTORY
WHERE JOB_ID IN
(
    SELECT JOB_ID
    FROM JOBS
    WHERE JOB_ID IN
    (
        'AD_ASST',
        'FI_MGR',
        'FI_ACCOUNT',
        'AC_MGR',
        'AC_ACCOUNT',
        'SA_MAN',
        'SA_REP',
        'PU_MAN'
    )
);