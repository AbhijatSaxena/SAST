reg delete HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\\"Windows NT"\CurrentVersion\Winlogon /v DefaultPassword /f
reg add HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\\"Windows NT"\CurrentVersion\Winlogon /v AutoAdminLogon /t REG_SZ /d 0 /f
exit