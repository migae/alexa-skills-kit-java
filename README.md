# Alexa Skills Kit modified to work on  GAE

The official
https://github.com/amzn/alexa-skills-kit-java[alexa-skills-kit-java]
uses ` org.apache.commons.lang3.Validate` and
`org.apache.commons.lang3.StringUtils`, both of which cause security
exceptions on GAE.

Only a few minor routines from the apache packages are used, though,
so this fork replaces those packages with `migae.Validate` and
`migae.StringUtils`, respectively. The code is taken directly from the
apache source files. So what we're really doing is stripping out
everything in the apache libs except what the skills kit actually
uses.

Original README starts here:

# Java Alexa Skills Kit SDK & Samples

##Alexa Skills Kit Documentation
The documentation for the Alexa Skills Kit is available on the [Amazon Apps and Services Developer Portal](https://developer.amazon.com/appsandservices/solutions/alexa/alexa-skills-kit/).

## Contents
The included samples represent how to use Java AWS Lambda functions as Alexa Skills.
The following samples are included (ordered by complexity, see the Using Alexa Skills Kit Samples
link below for more details):

- HelloWorld: a simple skill that repeats Hello World! on user input
- SpaceGeek : a simple skill that responds to the user with a space fact.
- Session: a simple skill that asks for your favorite color, then repeats it back to you using session attributes.
- MinecraftHelper : a simple skill that responds to the user's recipe queries with formulas.
- WiseGuy : a skill that tells knock knock jokes.
- HistoryBuff : a skill that gives historical information that happened on a user provided day.
- Savvy Consumer : a skill that looks up a category on Amazon and returns the best selling products.
- TidePooler : a skill that looks up tide information for various cities.
- ScoreKeeper : a skill that can keep score of a game.

## Usage
Navigate to the README.md in each sub directory in the samples folder and follow the instructions for getting the sample up and running.

## Resources
Here are a few direct links to our documentation:

- [Using the Alexa Skills Kit Samples](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/using-the-alexa-skills-kit-samples)
- [Getting Started](https://developer.amazon.com/appsandservices/solutions/alexa/alexa-skills-kit/getting-started-guide)
- [Invocation Name Guidelines](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/choosing-the-invocation-name-for-an-alexa-skill)
- [Developing an Alexa Skill as an AWS Lambda Function](https://developer.amazon.com/appsandservices/solutions/alexa/alexa-skills-kit/docs/developing-an-alexa-skill-as-a-lambda-function)
