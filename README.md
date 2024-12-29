# Physics Simulations in Java Starter Code

## A. Install Java
1. Go to https://www.oracle.com/java/technologies/downloads/ and select the latest Java version for your machine (macOS, Windows)

2. For Mac, in Terminal
```
mkdir ./Library/Java/JavaVirtualMachines
```

3. For Mac, in Terminal
```
mv ~/Downloads/jdk-23.0.1.jdk ./Library/Java/JavaVirtualMachines
```

## B. Install Maven (Mac)
1. First, ensure you have Homebrew installed on your Mac. If not, you can install it by running this command in Terminal:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

2. Once Homebrew is installed, you can install Maven by running the following command in Terminal:

```bash
brew install maven
```

3. After the installation is complete, you can verify that Maven was installed correctly by checking its version:

```bash
mvn -version
```


## C. Import and Build project
1. In VSCode, View menu > Command Palette > Git Clone > paste `https://github.com/kjergens/physicssimulation.git`
2. Terminal menu > Run Build Task 
3. See more in the text book. https://kjergens.github.io/csx/

