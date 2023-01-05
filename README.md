# README.md

## Tech Stack
- Java
- Cucumber
- Selenium WebDriver
- Appium

**Needed Application/Device:**
- IntelliJ IDEA
- Android Emulator / Android Device

## How to do initial setup
1. Install Java by running this command in the terminal `brew cask install adoptopenjdk8`
2. Check the version of the installed Java, to make sure it is in correct version `java -version openjdk version`
3. Make sure you have already installed **Intellij IDEA** and **Cucumber for Java** + **Gherkin** packages installed in **IntelliJ IDEA**
4. Install NodeJS by running this command in the terminal `brew install node`
5. Install Appium by running this command in the terminal `npm install -g appium`
6. Install maven3 by running this command in the terminal `brew install maven`
7. Add this configuration in your bash or zshrc file, change the username with yours
> export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home 
> export ANDROID_HOME=/Users/{username}/Library/Android/sdk 
> export PATH="${ANDROID_HOME}/tools:${PATH}" export PATH="${ANDROID_HOME}/emulator:${PATH}" 
> export PATH="${ANDROID_HOME}/platform-tools:${PATH}
8. Restart your mac computer

## How to setup the project and run the test
