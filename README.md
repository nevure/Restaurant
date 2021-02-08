# ITProject-ERP-Backend

For this project, whe have a given repo named ITProject-ERP-Frontend,
with a GitHub remote URL: https://github.com/it-academyproject/ITProject-ERP-Backend.git

This documentation will guide you through this Spring project installation.

NOTE: in this documentation...

    We will use <localProjectFolderName> as a generic alias for the local folder's name
    We will use <repoURL> as a generic alias for the remote repo's URL
    We will use <featureBranchName> as a generic alias for the branches generated from 'Dev'
    We will use <yourGitHubName> and <yourGitHubEmail> as alias for your user name and email registered in your GitHub account
    We will use <ScrumTask_ID> as alias for your tasks's id as stated in your SCRUM table.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 
See deployment for notes on how to deploy the project on a live system.

### Prerequisites

It's recommended to have an editor installed that supports Spring and has an application server incorporated. 
Otherwise, you can manually install the application server and follow the instructions for running the program locally. 

#### GIT and GITHUB
Skip this section's steps if you already have GIT  installed your local machine, and a valid GitHub account.
If not, follow next steps:

> 1. Download and install git CLI if you haven't yet: https://git-scm.com/
 
> 2. Create a GitHub account if you haven't yet: https://github.com/
>    Then check for its version, to make sure the installation went fine.
>    To do so, type this in your terminal or console:

	git--version

> 3.  Then, set up your name and email for local **git CLI**.  
>     Type the following commands in your terminal or console:

    git config –-global user.name <yourGitHubName>
    git config –-global user.email <yourGitHubEmail>

> 4.  Name and email must match those you registered in **GitHub** account.  
>     Then, check result. Type in:

    git config –-global user.name
    git config –-global user.email

#### Dependencies for Spring.

Resultados de traducción
It is recommended to consult the pom.xml file of the DEV branch of the project. This file includes all the current requirements to run the application at this time.
Summarizing:
- Validations: groupId: javax.validation. Artifact: validation-api
- JPA.
- Spring Security
- Starter Web. (to run the application server included in the IDE)
- modelMapper. For the DAO-DTO mapping.
- Jsonwebtoken. To work with tokens in authentication.
- security-crypto and security core.
- commons.lang3 from apache.
- the DevTools.
- Mysql Connector.
- hibernate validations. 

