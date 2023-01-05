# README.md

Recording Link: [here](https://drive.google.com/file/d/1mvc2hlZd87A17xnen0bzlvqAE4nNGmP7/view?usp=sharing)

## Scenario
The scenario for this test is to buy the following product
- Item: Sauce Lab Back Packs
- Qty: 2
- Color: Blue

## Tech Stack
- Java
- Cucumber
- Selenium WebDriver
- Appium

**Needed Application/Device:**
- IntelliJ IDEA
- Android Emulator / Android Device
- Android Studio with Android SDK

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

## How to setup the project and run the scenario
1. Clone this repository
2. Open this repository in **Intellij IDEA**
3. Open the terminal and go to the repository root directory
4. Run `mvn clean install`
5. Run the Android Emulator and make sure this [apk](https://github.com/saucelabs/my-demo-app-android/releases/download/1.0.13/mda-1.0.13-15.apk) is already installed in the emulator
6. In the Capabilities.java file, change the device name to your device name, you can get the name by running this command `adb devices`

<img width="331" alt="Screenshot 2023-01-05 at 11 46 52" src="https://user-images.githubusercontent.com/38350074/210697336-5321cc75-07d1-46f7-8532-dea6d71bef96.png">

<img width="1196" alt="Screenshot 2023-01-05 at 11 45 50" src="https://user-images.githubusercontent.com/38350074/210697502-f6bdb35d-3bc1-4eda-9874-6f7b2ec48225.png">
7. Go to this file `src/main/resources/features/scenarioTest.feature` and run the scenario by click the green play button 

<img width="694" alt="Screenshot 2023-01-05 at 11 51 39" src="https://user-images.githubusercontent.com/38350074/210697903-c684e79a-2ebc-48b5-b2e5-58ee1ea6dd4a.png">

8. Click **Run "Feature: scenarioTest"** and the scenario will run immediately
