# Dining Philosophers Problem
[![Build Status](https://travis-ci.com/Samuellucas97/Phylosophers-Dinner.svg?branch=master)](https://travis-ci.com/Samuellucas97/Phylosophers-Dinner)
![License MIT](https://img.shields.io/npm/l/express.svg)

## Introduction  

This folder contains the implementation of the Concurrency Programming problem, Dining Philosophers. Given this, it refers to one of the activities of the _Concurrency Programming_ discipline taught by dr. Nélio Cacho Bachelor of Information Technology at the Federal University of Rio Grande do Norte (__UFRN__).


- [Prerequisites](#prerequisites) - Project prerequisites
- [About the algorithm](#about-the-algorithm) - Informations about the algorithm.
- [Author](#author) - Project author.


## Prerequisites

You need the following programs to use this repository:

 - JDK 11

_This project was loaded on Eclipse using above configurations_

## About the algorithm

In resume, Five silent philosophers sit at a round table with bowls of spaghetti. Forks are placed between each pair of adjacent philosophers.

Each philosopher must alternately think and eat. However, a philosopher can only eat spaghetti when they have both left and right forks. Each fork can be held by only one philosopher and so a philosopher can use the fork only if it is not being used by another philosopher. After an individual philosopher finishes eating, they need to put down both forks so that the forks become available to others. A philosopher can only take the fork on their right or the one on their left as they become available and they cannot start eating before getting both forks.

Eating is not limited by the remaining amounts of spaghetti or stomach space; an infinite supply and an infinite demand are assumed.

The problem is how to design a discipline of behavior (a concurrent algorithm) such that no philosopher will starve; i.e., each can forever continue to alternate between eating and thinking, assuming that no philosopher can know when others may want to eat or think.

## Author 

| Name: | Email: |  
| ---------- | ------------- | 
|`Samuel Lucas de Moura Ferino` 	| _samuellucas97@ufrn.edu.br_  


