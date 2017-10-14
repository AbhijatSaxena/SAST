reg import batch\sast\injectlogo\injectlogon.reg
reg add HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\\"Windows NT"\CurrentVersion\Winlogon /v LogonPrompt /t REG_SZ /d "Modified by SAST v1.0" /f
exit