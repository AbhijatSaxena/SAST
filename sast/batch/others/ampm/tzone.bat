reg add HKEY_CURRENT_USER\\"Control Panel"\International /v s1159 /t REG_SZ /d %1 /f
reg add HKEY_CURRENT_USER\\"Control Panel"\International /v s2359 /t REG_SZ /d %2 /f
tskill explorer
exit
      