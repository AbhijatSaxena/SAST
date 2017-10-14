@echo off
echo ##########################################################
echo #Welcome to SYSTEM ADMINISTRATION and SECURITY TOOL SETUP#
echo ##########################################################

set /p pth= Enter the SAST installation path 
xcopy sast\* %pth% /s /i

echo #########################
echo #Installation Succesfull#
echo #########################
echo :
echo :
echo :
echo Press any button to Load SAST v1.0.....................
pause
cd %pth%
call run.bat