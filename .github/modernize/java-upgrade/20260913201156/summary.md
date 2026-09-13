# Java Upgrade Summary: inslacc

## Outcome

Java compiler source and target were upgraded from 17 to Java 25 LTS in `pom.xml`.

## Validation

- Baseline on JDK 17: compilation succeeded; all tests passed.
- Final on JDK 25.0.2: main and test compilation succeeded; all tests passed.
- Maven: 3.9.12.
- Direct dependency CVE scan: no known CVEs requiring fixes.

## Changes

- `maven.compiler.source`: `17` to `25`
- `maven.compiler.target`: `17` to `25`
- No application source, test, dependency, or security-control changes were required.

## Version Control

- Branch: `appmod/java-upgrade-20260913201156`
- Upgrade commit: `d16e50cf6e70439455c976f741aea14a83a9fc8f`

## Remaining Risk

No known upgrade-specific risks remain after compilation, test, and dependency validation.
