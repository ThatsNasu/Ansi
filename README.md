# Ansi - Formatting with Escapes made easy

[![Build](https://github.com/thatsnasu/Ansi/actions/workflows/gradle.yml/badge.svg)](https://github.com/thatsnasu/Ansi/actions/workflows/gradle.yml)
[![Version](https://img.shields.io/github/v/release/thatsnasu/OpenNetLib?include_prereleases)](https://github.com/thatsnasu/Ansi/releases)
[![Discord channel](https://img.shields.io/discord/411109318511820800?logo=discord)](https://discord.gg/MdsuFg2bPC)

Ansi is easy to use library for easier text formatting with ANSI Escape Sequences by providing the required methods, while keeping the API lightweight and logical. Its written in and for Java. Despite being in an early stage, it already saves a lot of work and implementation. If you want to help me improve this library further, feel free to open Issues, fork this Project for your own use or post questions as well as answers to already existing questions.

---

Do you have some questions about this library that are not covered by the [wiki](https://github.com/thatsnasu/Ansi/wiki) (coming soon), or want to help improving it? Feel free to join us on our [Discord Server](https://discord.gg/MdsuFg2bPC).


## Adding this library as dependency
is pretty straight forward. Just grab the jar file and add it to your projects dependencies, or use one of the following build tools.

### If you are using Gradle
add the following line to your dependencies:
```
implementation 'dev.thatsnasu:Ansi:0.1.0'
```

### For Maven
it would be:
```
<dependency>
    <groupId>dev.thatsnasu</groupId>
    <artifactId>Ansi</artifactId>
    <version>0.1.0</version>
</dependency>
```

### For everything else
Visit [maven central](https://search.maven.org/artifact/dev.thatsnasu/Ansi) and pick the release you like to find the code you need.


## Features
 - Predefined, ready to use Colors and Formats
 - Combining Colors and Formats as you like
 - Storing Color and Format-presets for reuse


## How to use
Check out the [Getting started](https://github.com/thatsnasu/Ansi/wiki/Getting-started) section (coming soon).


## Some words about my Motivation
Writing several Java Programs, i noticed that i often reuse my own code from Project to Project, namely logging mechanisms and Colorization with ANSI Escape Sequences. Memorizing this Sequences is hard, using a library with an easy to use API for it and getting what you need with one or only a few lines of logically structured code isn't. Refurbishing Code will do once in a while, but on the long hand its hard to maintain across multiple Projects, so i started developing this library to have to change only one part of the code and on the same time give others the opportunity to use it aswell.