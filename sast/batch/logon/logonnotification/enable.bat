reg add HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\policies\system /v legalnoticecaption /t REG_SZ /d %1 /f
reg add HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\policies\system /v legalnoticetext /t REG_SZ /d %2 /f
exit