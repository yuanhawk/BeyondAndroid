# BeyondAndroid

# Week 8
With reference to: https://developer.android.com/topic/libraries/view-binding<br>
So for those who looking for an alternative way to avoid declaring findViewByIds boilerplate codes, I have done a mini tutorial on ViewBinding. Since Prof Kenny 
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

You can access your widgets via binding, and say goodbye to findViewById. Isn't it lovely to save your code lines!

Warning: If you use it, the codes are going to be different from the profs, I'm here to introduce the code, not to add your pains.

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

# Week 9
With reference to: https://developer.android.com/guide/navigation/<br>

A long time ago in a galaxy far, far away… Android was born.

The ecosystem was young and there were practically no design or architecture guidelines. Developers back then used “god Activities” (Activities having thousands lines of code) left and right. These were dark, but interesting times. Well, at least in my imagination. I myself became Android developer at a much later stage. Therefore, my own historical perspective is probably incomplete, so take it with a grain of salt. (sorry for the rip off from https://www.techyourchance.com/dagger-android-dead/, but the analogy is spot on)

For those who are attempting fragments instead, here is a nice recommendation from the way to go, avoid your fragment transactions found in some tutorials (it's outdated anyways), use Jetpack Navigation instead. I am assuming that you know Activity Lifecycle here, Fragments just has slightly more lifecycle events, go read up on: https://developer.android.com/guide/fragments/lifecycle, and I won't be spoonfeeding everything here.

The strongest benefit about Jetpack Navigation is its navigation graph and its testability, so I am just introducing some functionality, and I expect some form of self-study here.
