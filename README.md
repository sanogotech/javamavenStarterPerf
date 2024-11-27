# simple-java-maven-app



Voici un exemple de fichier `README.md` pour un projet Maven avec une structure d'arborescence et les 5 commandes Maven les plus utiles à connaître :


# Projet Maven

## Arborescence du projet

Voici l'arborescence de base d'un projet Maven typique :

```
mon-projet-maven/
│
├── pom.xml                  # Fichier de configuration principal de Maven
│
├── src/                     # Répertoire contenant le code source
│   ├── main/
│   │   ├── java/            # Code Java de l'application
│   │   └── resources/       # Ressources (fichiers de configuration, etc.)
│   └── test/
│       ├── java/            # Tests unitaires
│       └── resources/       # Ressources pour les tests
│
└── target/                  # Dossier généré contenant les artefacts (JAR, WAR, etc.)
```

## Top 5 des commandes Maven à connaître

Voici les 5 commandes Maven les plus couramment utilisées dans le développement d'un projet Maven :

1. **`mvn clean`**
   - **Description** : Cette commande supprime le répertoire `target/` et tous les artefacts précédemment générés. Cela permet de repartir d'une base propre avant de reconstruire le projet.
   - **Utilisation** :
     ```bash
     mvn clean
     ```

2. **`mvn compile`**
   - **Description** : Compile le code source de votre projet situé dans `src/main/java`. Elle prépare le projet pour l'étape suivante de construction.
   - **Utilisation** :
     ```bash
     mvn compile
     ```

3. **`mvn test`**
   - **Description** : Exécute les tests unitaires situés dans `src/test/java`. Maven utilise JUnit ou TestNG en fonction de la configuration de votre projet.
   - **Utilisation** :
     ```bash
     mvn test
     ```

4. **`mvn package`**
   - **Description** : Cette commande compile le code, exécute les tests, et génère l'artefact (JAR, WAR, etc.) dans le répertoire `target/`.
   - **Utilisation** :
     ```bash
     mvn package
     ```

5. **`mvn install`**
   - **Description** : Cette commande va un peu plus loin que `mvn package` en installant l'artefact généré dans le dépôt local Maven (`~/.m2/repository`). Cela permet à d'autres projets Maven d'utiliser ce artefact comme dépendance.
   - **Utilisation** :
     ```bash
     mvn install
     ```

## Conclusion

Maven est un outil puissant pour la gestion de projet Java. Ces cinq commandes de base sont essentielles pour la gestion du cycle de vie de votre projet. Pour plus de commandes et d'options avancées, consultez la [documentation officielle de Maven](https://maven.apache.org/).


Ce `README.md` fournit une vue d'ensemble de la structure d'un projet Maven ainsi que des commandes essentielles pour la gestion et la construction d'un projet Maven.
