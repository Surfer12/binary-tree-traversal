# Development Environment Setup Guide

## Required Tools
- Maven
- Node.js & npm
- Go
- Python 3 & pip
- Gradle
- Java 20+
- GitHub CLI

## Installation Steps

### 1. Java Development Kit (JDK) 20+
1. Download: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
2. Installation:
   - Run installer
   - Set JAVA_HOME: `C:\Program Files\Java\jdk-20`
   - Add to PATH: `%JAVA_HOME%\bin`
3. Verify: `java -version`

### 2. Maven
1. Download: [Apache Maven](https://maven.apache.org/download.cgi)
2. Installation:
   - Extract to `C:\Program Files\Apache\maven`
   - Add to PATH: `C:\Program Files\Apache\maven\bin`
3. Verify: `mvn -version`

### 3. Node.js & npm
1. Download: [Node.js](https://nodejs.org/)
2. Installation:
   - Run installer (npm included)
   - PATH automatically updated
3. Verify: 
   - `node -v`
   - `npm -v`

### 4. Go
1. Download: [Go](https://golang.org/dl/)
2. Installation:
   - Run installer
   - PATH automatically updated
3. Verify: `go version`

### 5. Python 3 & pip
1. Download: [Python](https://www.python.org/downloads/)
2. Installation:
   - Run installer
   - ✓ Check "Add Python to PATH"
3. Verify:
   - `python --version`
   - `pip --version`

### 6. Gradle
1. Download: [Gradle](https://gradle.org/install/)
2. Installation:
   - Extract to `C:\Gradle`
   - Add to PATH: `C:\Gradle\bin`
3. Verify: `gradle -v`

## Adding to System PATH (Windows)

1. Open System Properties
   - Windows key + Pause/Break
   - OR: Control Panel → System → Advanced System Settings

2. Navigate to Path Settings
   - Click "Environment Variables"
   - Under "System Variables", find "Path"
   - Click "Edit"

3. Add New Paths
   - Click "New"
   - Add required paths
   - Click "OK"

4. Restart Terminal
   - Close and reopen command prompt
   - OR: restart computer

## Troubleshooting

- Command not found: Verify PATH settings
- Version mismatch: Reinstall latest version
- Path errors: Check installation directories

## Notes
- Install tools in order listed
- Restart terminal after PATH changes
- Use LTS versions when available
