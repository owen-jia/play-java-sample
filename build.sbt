name := """play-java-sample"""
organization := "com.ts"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion ++= "2.12.8"

libraryDependencies += guice
