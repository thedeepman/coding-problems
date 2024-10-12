# seed-bdd-java
Seed Project for using Behavior Driven Development in Java

Uses Maven Cucumber Archetype to setup using [Gherkin](https://cucumber.io/docs/gherkin/reference/) syntax. Based off [Cucumber's Tutorial](https://cucumber.io/docs/guides/10-minute-tutorial/?lang=java)

Project Structure
- Gherkin features named .feature in 'src\test\resources'
- Step definitions inside 'src\test\java\'. Can be in different packages and subpackages within
  - Step definitions are actual java files
- A feature can have multiple step definition files and vice versa
  - Can reuse steps across features and other optimization

### Instructions
This is a template repo. Follow [these instruction](https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template) to generate repo out of template
Standard maven setup
- Run 'mvn clean install' for initial setup
- 'mvn test' to run all tests including BDD

### Future
- Create branches for specific types of projects like SpringBoot, REST APIs,...