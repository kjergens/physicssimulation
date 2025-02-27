# Physics Simulations Setup Guide
Do the following to install VSCode, Java, other important components, and, finally, the starter code:
- [ ] 1. Install Java Coding Pack for VSCode - https://code.visualstudio.com/docs/java/java-tutorial
- [ ] 2. Install Java Extension Pack - https://code.visualstudio.com/docs/java/java-build
- [ ] 3. Open VS Code
- [ ] 4. Open the Command Palette by going to the menu (View > Command Palette)
- [ ] 5. Type Git:Clone in the Command bar (at the top), then select Git:Clone from the dropdown.
      If Git:Clone does not appear in the drop-down:
     - [ ] Go to (View > Source Control). Follow the instructions to install Git.
     - [ ] Restart VSCode.
     - [ ] Open the Command Palette by going to the menu (View > Command Palette)
     - [ ] Type Git:Clone in the Command bar (at the top), then select Git:Clone from the dropdown.
- [ ] 7. Paste `https://github.com/kjergens/physicssimulation.git` in the Command bar (at the top).
- [ ] 8. There should be a dialog pop-up that asks which folder. Select 'New Folder' and name it 'workspace'.
- [ ] 8. Git should download a folder called 'physicssimulations' and have several subfolders and code in it.
- [ ] 9. Build the project by going to (Terminal > Run Build Task ...)
- [ ] 10. Test if it worked by opening physicssimulations > src/main/java > GettingStarted.java





# OLD INSTRUCTIONS
## A. Install VSCode
1. Go to https://code.visualstudio.com/download 
2. Select the option the best fits your system
3. Double-click the package you downloaded to install it. 

## B. Install Java
### Mac
1. Go to https://www.oracle.com/java/technologies/downloads/ and select the latest Java version for your machine (macOS, Windows)
2. Double-click the package you downloaded to install it.
3. Open Terminal and enter:
```
mkdir ./Library/Java/JavaVirtualMachines
```

4. Open Terminal and enter:
```
mv ~/Downloads/jdk-23.0.2.jdk ./Library/Java/JavaVirtualMachines
```

## C. Install Maven 
### Mac Instructions:
1. First, ensure you have Homebrew installed on your Mac. If not, you can install it by running this command in Terminal:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

2. Add homebrew to the PATH variable: You can do so by pasting the following into Terminal:

```
export PATH="/opt/homebrew/bin:$PATH"
```

3. Once Homebrew is installed, you can install Maven by running the following command in Terminal:

```bash
brew install maven
```

4. After the installation is complete, you can verify that Maven was installed correctly by checking its version:

```bash
mvn -version
```
   

## D. Import and Build project
1. In VSCode, View menu > Command Palette > Git Clone > paste `https://github.com/kjergens/physicssimulation.git`
2. In VS Code, select the menu Terminal > Run Build Task ...
3. Install the Java Extension Pack
4. See more in the text book. https://kjergens.github.io/csx/

