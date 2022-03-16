# BeyondAndroid

# Week 8
With reference to: https://developer.android.com/topic/libraries/view-binding<br>
So for those who looking for an alternative way to having to declare findViewByIds boilerplate codes, I have done a mini tutorial on ViewBinding. Since Prof Kenny 
has taught only Activity, so I will do a demo using Activity, you can attempt it on Fragment, if you would like to.

Step 1:<br>
Add this
```
    buildFeatures {
        viewBinding true
    }
```
to your module-level build.gradle file
<img src="./Week 8 Xtras/add_dep_to_gradle.png"/>

Step 2:<br>
Edit your Activity to contain a binding object: ActivityMainBinding binding, for my example, followed by ```setContentView(binding.getRoot())```<br>
binding.getRoot() returns a View, just like your typical R.id.activity_main.

You can access your widgets via binding, so you can escape the pains of findViewById, isn't it lovely for your project!

Warning: If you use it, the codes are going to be different from the profs, I'm here to introduce the tool, not to add your pains.

<img src="./Week 8 Xtras/viewbind.gif"/>

Note: I have added logcat messages, which are your equivalent terminal System.out.println() codes<br>
Log.t (tag)<br>
Log.d(String, String) (debug)<br>

There are other beautiful logcat messages:<br>
Log.v(); // Verbose<br>
Log.i(); // Info<br>
Log.w(); // Warning<br>
Log.e(); // Error

So please use them to debug psps...
