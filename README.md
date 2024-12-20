

# 🐾 **SafwenJAVA-Bar**  
## 🌟 **Zoo Management Project**  

Ce projet est une simulation basée sur **Java** pour la gestion des zoos. Il met en œuvre des concepts clés de la programmation orientée objet, comme :  
- 💡 Polymorphisme  
- 🚨 Gestion des exceptions personnalisées  
- 🛠️ Interfaces & Énumérations  

> Développé dans le cadre des **Prosits 1 à 8**.

---

## 🚀 **Fonctionnalités Principales**

### 🦁 Gestion des Animaux et du Zoo  
- Ajouter, supprimer ou rechercher des animaux.  
- Comparer deux zoos pour déterminer lequel a le plus d'animaux.  

### ⚠️ Exceptions Personnalisées  
- **`ZooFullException`** : Lorsque le zoo dépasse sa capacité maximale.  
- **`InvalidAgeException`** : Pour empêcher la création d'un animal avec un âge négatif.  
- **`DuplicateAnimalException`** : Empêche d'ajouter deux fois le même animal.  

### 🐬 Comportements Spécialisés  
- Les animaux aquatiques peuvent **nager** (`swim()`).  
- Les comportements alimentaires sont définis via des interfaces : **Carnivore**, **Herbivore**, **Omnivore**.  
- Démonstration du **polymorphisme** à travers des classes comme `Dolphin` et `Penguin`.

---

## 📂 **Structure du Projet**

- 📁 `src/tn/esprit/gestionzoo/entities` : Classes entités (`Animal`, `Zoo`, `Aquatic`, etc.).  
- 📁 `src/tn/esprit/gestionzoo/exceptions` : Exceptions personnalisées.  
- 📁 `src/tn/esprit/gestionzoo/main` : Point d'entrée de l'application (`Main`).  

---

## 🛠️ **Comment l'utiliser ?**

### ⚙️ **Tests**  
- 💻 Testez manuellement :  
  - Ajout, recherche et suppression d'animaux.  
  - Validation des exceptions personnalisées (`ZooFullException`, `InvalidAgeException`, etc.).  

### 🏗️ **Compilation**  
- Compilez le projet en utilisant simplement `javac`. Aucun processus complexe n’est nécessaire.  

---

## 📜 **Liens vers les Prosits**

Consultez les branches correspondantes pour chaque Prosit :  
- 🌱 **[Prosit 1](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit1)** : Initialisation du projet.  
- 🐾 **[Prosit 2](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit2)** : Classes de base et méthode `displayZoo()`.  
- 🔄 **[Prosit 3](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit3)** : Gestion d’ajout et suppression d'animaux.  
- 🛡️ **[Prosit 4](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit4)** : Encapsulation et validation.  
- 🐟 **[Prosit 5](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit5)** : Ajout des classes `Aquatic` et `Terrestrial`.  
- 🌊 **[Prosit 6](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit6)** : Gestion des animaux aquatiques.  
- 🛑 **[Prosit 7](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit7)** : Gestion des exceptions.  
- 🍴 **[Prosit 8](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit8)** : Interfaces alimentaires.  

---

## 🧠 **Concepts Clés Utilisés**  
- **Polymorphisme** : Illustré par la méthode `swim()`.  
- **Interfaces** : Implémentation des comportements alimentaires.  
- **Exceptions Personnalisées** : Validation rigoureuse des données.  

---

## 📖 **Documentation Supplémentaire**  
- **[Documentation officielle Java](https://docs.oracle.com/javase/8/docs/)** 📚  

---

## 🐛 **Dépannage**

### Erreurs Courantes  
- ❌ **`unreported exception InvalidAgeException`** : Vérifiez l’utilisation des blocs `try-catch`.  
- ❌ **`cannot find symbol`** : Assurez-vous que les fichiers et chemins sont correctement configurés.  

---

## 🏁 **Déploiement**  
Ce projet fonctionne localement sur une **JVM**. Aucun déploiement spécifique n'est requis.  

---

## 👤 **Auteur**  
**Safwen HABOUBI**  
💻 Diplômé en Sciences Informatiques  


# 👔 **Gestion d'Employés : Prosits 9 à 12**  

## 📝 **Description**  

Ce module étend le projet pour intégrer un **système de gestion des employés et des départements**, tout en exploitant des fonctionnalités modernes comme **les lambdas** et **les streams**. Concepts clés :  

- 🏢 Gestion des employés et des départements.  
- 📦 Collections avancées : `HashSet`, `HashMap`.  
- 🔀 Tri et filtrage : `TreeSet`, `TreeMap`.  
- 🚀 Programmation fonctionnelle avec **lambda** et **API Stream**.  

---

## 🚀 **Fonctionnalités**  

### 👥 **Gestion des Employés et des Départements : Prosits 9 à 11**  
- ➕ Ajouter, rechercher et supprimer des employés.  
- 🏢 Gestion des départements via `HashSet`, tri avec `TreeSet`.  
- 🔗 Associer des employés aux départements avec `HashMap`.  
- 🔄 Tri des employés et départements à l'aide de `TreeMap`.  

### 🎓 **Gestion des Étudiants avec Lambdas et Streams : Prosit 12**  
- ✅ Affichage conditionnel des étudiants avec des prédicats (`Predicate`).  
- 📜 Extraction des noms en une chaîne formatée.  
- ⚙️ Création dynamique d'étudiants via un **fournisseur** (`Supplier`).  
- 🧮 Tri des étudiants avec un **comparateur** (`Comparator`).  
- 🌊 Conversion de listes en flux (`Stream`).  

---

## 📂 **Structure du Projet : Prosits 9 à 12**  

- 📁 `src/tn/esprit/gestionemployes/entities` : Classes principales (`Employe`, `Departement`, `Etudiant`).  
- 📁 `src/tn/esprit/gestionemployes/management` : Interfaces (`IGestion`, `IDepartement`, `Management`) et leurs implémentations.  
- 📁 `src/tn/esprit/gestionemployes/main` : Classe `Main` pour tester toutes les fonctionnalités.  

---

## 🔗 **Liens vers les Prosits**  

Chaque Prosit est disponible sur une branche dédiée :  

- 🌱 **[Prosit 9](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit9)** : Gestion des employés avec `ArrayList`.  
- 🏢 **[Prosit 10](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit10)** : Gestion des départements avec `HashSet` et tri via `TreeSet`.  
- 🔗 **[Prosit 11](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit11)** : Affectation des employés aux départements avec `HashMap`, tri avec `TreeMap`.  
- 🌊 **[Prosit 12](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit12)** : Gestion des étudiants avec lambdas et streams.  

---

## 🧠 **Concepts Clés Utilisés**  

### 🏢 **Gestion des Employés et Départements**  
- Collections avancées : `ArrayList`, `HashSet`, `HashMap`.  
- 🔀 Tri et filtrage avec `TreeSet`, `TreeMap`.  
- 🎯 Validation et encapsulation via des méthodes redéfinies (`toString`, `equals`, etc.).  

### 🧑‍💻 **Programmation Fonctionnelle**  
- **Lambdas** et **Streams** : Manipulation dynamique des données (`Predicate`, `Consumer`, `Function`).  
- Application des paradigmes fonctionnels pour une gestion optimisée des étudiants.  

---

## 🛠️ **Scripts Disponibles**  

Dans le répertoire du projet, exécutez :  

### ✅ **Tests**  
- Gestion des employés et départements.  
- Affectation et tri avec `HashMap`, `TreeMap`.  
- Manipulation des étudiants avec lambdas et streams.  

### 🏗️ **Compilation**  
- Compilez simplement avec `javac`. Aucun processus complexe requis.  

---

## 👤 **Auteur**  

**Safwen HABOUBI**  
💻 Diplômé en sciences informatiques  

---

## ⚖️ **Licence**  

📜 Ce projet est open source. Vous êtes libre de le modifier et de le redistribuer !  

---

## 🔍 **Notes Importantes**  
- 🛠️ Testez chaque module dans sa branche respective.  
- 🖥️ Ce projet fonctionne localement sur une JVM compatible.  



---

## ⚖️ **Licence**  
Ce projet est open source. Libre à vous de le modifier et de le partager !  

