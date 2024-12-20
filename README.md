

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

---

## ⚖️ **Licence**  
Ce projet est open source. Libre à vous de le modifier et de le partager !  

