# Rescue Animal System

A console-based Java application for managing a rescue animal organization's inventory of trained service dogs and monkeys. Built as part of a school project exploring core OOP principles in Java.

## Overview

The system allows staff to intake new animals, reserve them for service in specific countries, and view lists of animals by type or availability. Animal records track training status, origin, reservation state, and species-specific attributes.

## OOP Concepts Demonstrated

- **Inheritance**: `Dog` and `Monkey` both extend the `RescueAnimal` base class, inheriting shared fields like name, gender, age, weight, training status, and reservation state while adding their own species-specific attributes.
- **Encapsulation**: All instance variables are private and exposed only through public getters and setters.
- **Polymorphism**: `printAnimals()` handles dogs, monkeys, and the combined available list through a single method with branching behavior based on a `listType` parameter.
- **Abstraction**: `RescueAnimal` defines the shared contract for all animal types, keeping common logic in one place.

## Class Structure

```
RescueAnimal          (base class)
├── Dog               extends RescueAnimal; adds breed
└── Monkey            extends RescueAnimal; adds species, tail length, height, body length

Driver                entry point; manages animal lists and user interaction
```

## Features

- Intake new dogs or monkeys (with duplicate name detection)
- Species validation for monkey intake (only approved species accepted)
- Reserve an available, fully trained animal for a given country
- Print all dogs or all monkeys in the system
- Print a combined list of all animals that are fully trained and not yet reserved

### Approved Monkey Species

Capuchin, Guenon, Macaque, Marmoset, Squirrel Monkey, Tamarin

## Running the Program

Requires Java 14+ (uses switch expressions).

```bash
javac *.java
java Driver
```

## Menu Options

| Input | Action |
|-------|--------|
| `1` | Intake a new dog |
| `2` | Intake a new monkey |
| `3` | Reserve an animal |
| `4` | Print all dogs |
| `5` | Print all monkeys |
| `6` | Print all available (trained, unreserved) animals |
| `q` | Quit |
