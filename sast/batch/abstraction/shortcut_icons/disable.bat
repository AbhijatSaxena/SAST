reg delete HKEY_CLASSES_ROOT\lnkfile /v IsShortcut /f
reg delete HKEY_CLASSES_ROOT\piffile /v IsShortcut /f
tskill explorer
exit