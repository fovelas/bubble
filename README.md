### Prerequisites

Add this maven line to root `settings.gradle`

~~~
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
~~~

-----------------------------------------

### Dependency

Lastly add this line to `build.gradle` file in app module.

~~~
dependencies {
    implementation 'com.github.fovelas:bubble:1.0.0'
}
~~~

-----------------------------------------

### Visuals

<img src="images/bubble-error.png" width="auto" height="50"> \
<img src="images/bubble-info.png" width="auto" height="50"> \
<img src="images/bubble-success.png" width="auto" height="50"> \
<img src="images/demo.gif" width="auto" height="500">

-----------------------------------------

### Usage

Very similar to use of Android Toast. There are three different type of bubble.

-----------------------------------------

### Error Bubble

```java
Bubble.makeText(MainActivity.this, "Error message..", Bubble.TYPE_ERROR).show();
```

-----------------------------------------

### Info Bubble

```java
Bubble.makeText(MainActivity.this, "Info message..", Bubble.TYPE_INFO).show();
```

-----------------------------------------

### Success Bubble

```java
Bubble.makeText(MainActivity.this, "Success message..", Bubble.TYPE_SUCCESS).show();
```