reg add HKEY_CLASSES_ROOT\CLSID\{20D04FE0-3AEA-1069-A2D8-08002B30309D} /v LocalizedString /t REG_EXPAND_SZ /d "@%"SystemRoot"%\system32\shell32.dll,-9216" /f
tskill explorer
exit