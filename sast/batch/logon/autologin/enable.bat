reg add HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\\"Windows NT"\CurrentVersion\Winlogon /v AutoAdminLogon /t REG_SZ /d 1 /f
reg add HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\\"Windows NT"\CurrentVersion\Winlogon /v DefaultPassword /t REG_SZ /d %1 /f
exit