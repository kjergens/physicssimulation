# Physics Simulations in Java Starter Code

## A. Install Java
1. Go to https://www.oracle.com/java/technologies/downloads/ and select the latest Java version for your machine (macOS, Windows)
2. Double-click the package you downloaded to install it.
3. (Mac-only) Open Terminal and enter:
```
mkdir ./Library/Java/JavaVirtualMachines
```

4. (Mac-only) Open Terminal and enter:
```
mv ~/Downloads/jdk-23.0.2.jdk ./Library/Java/JavaVirtualMachines
```

## B. Install Maven (Mac)
1. First, ensure you have Homebrew installed on your Mac. If not, you can install it by running this command in Terminal:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

2. Add homebrew to the PATH variable: You can do so by running export

```
PATH="/opt/homebrew/bin:$PATH"
```

3. Once Homebrew is installed, you can install Maven by running the following command in Terminal:

```bash
brew install maven
```

4. After the installation is complete, you can verify that Maven was installed correctly by checking its version:

```bash
mvn -version
```

## C. Install VSCode
1. Go to https://code.visualstudio.com/download 
2. Select the option the best fits your system
3. Double-click the package yuo downloaded to install it. 
   

## D. Import and Build project
1. In VSCode, View menu > Command Palette > Git Clone > paste `https://github.com/kjergens/physicssimulation.git`
2. In VS Code, select the menue Terminal > Run Build Task ...
3. Install the Java Extension Pack
4. See more in the text book. https://kjergens.github.io/csx/

