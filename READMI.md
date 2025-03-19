# Gestion des Activités Pédagogiques

## 📚 Description
Un système complet pour organiser, suivre et analyser les activités pédagogiques et la participation des étudiants.

## 🎯 Objectifs
- Organiser les activités académiques
- Suivre la participation des étudiants
- Générer des statistiques d'engagement
- Faciliter la prise de décision pédagogique

## 🗃️ Structure de la Base de Données
### Tables Principales
| Table                 | Champs                          |
|-----------------------|---------------------------------|
| `Activité`            | id, intitule, date, description|
| `Étudiant`            | id, nom, prénom, email         |
| `ParticipationActivité`| activité_id, etudiant_id       |
| `User`                | login, password, email         |

## ⚙️ Fonctionnalités
- Création d'activités pédagogiques
- Inscription des étudiants aux activités
- Filtrage des participants par activité
- Recherche avancée d'activités
- Authentification sécurisée des utilisateurs
- Réinitialisation de mot de passe par email

## 🖼️ Diagrammes
- **Diagramme de Classe** : 
  ![Diagramme de classe](./src/gui/images/diagramme_class.png)

- **Diagramme d'Utilisation** : 
  ![Diagramme d'utilisation](./src/gui/images/utilisation.png)
## 🛠️ Technologies
**Frontend**:
- Java Swing (Interface graphique)
- Icons8 (Bibliothèque d'icônes)

**Backend**:
- MySQL (Base de données)
- JDBC (Connexion base de données)

**Outils**:
- NetBeans (IDE)
- StarUML (Modélisation)
- phpMyAdmin (Gestion BD)

## 🗄️ Code SQL
```sql
-- Création de la table Activité
CREATE TABLE Activité (
    id INT AUTO_INCREMENT PRIMARY KEY,
    intitule VARCHAR(255) NOT NULL,
    date DATE NOT NULL,
    description TEXT
);

-- Création de la table Étudiant
CREATE TABLE Étudiant (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    prénom VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- Table de liaison ParticipationActivité
CREATE TABLE ParticipationActivité (
    activité_id INT NOT NULL,
    etudiant_id INT NOT NULL,
    FOREIGN KEY (activité_id) REFERENCES Activité(id) ON DELETE CASCADE,
    FOREIGN KEY (etudiant_id) REFERENCES Étudiant(id) ON DELETE CASCADE
);

-- Table d'authentification
CREATE TABLE User (
    login VARCHAR(100) PRIMARY KEY,
    password VARCHAR(150) NOT NULL,
    email VARCHAR(255) NOT NULL
);