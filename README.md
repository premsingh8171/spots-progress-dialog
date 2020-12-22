# Spots  progress dialog


Android AlertDialog with moving spots progress indicator packed as android library.


### Usage

The library available in maven jcenter repository. You can get it using:
```dependency
repositories {

  			  maven { url 'https://jitpack.io' }
}

```

```
dependencies {

        implementation 'com.github.premsingh8171:spots-progress-dialog:Tag'
}
```

**Note:** The library requires minimum API level 17.

```kotlin
val dialog: AlertDialog = SpotsProgressDialog.Builder().setContext(context).build()
...
dialog.show()
...
dialog.dismiss()
```

### Customization

For dialog customization of dialog, like message and cancel listener, use `SpotsProgressDialog.Builder` methods.

##Java
```
 SpotsProgressDialog dialog = (SpotsProgressDialog) new SpotsProgressDialog.Builder()
                .setContext(MainActivity.this)
                .setMessage("Please wait, processing...")
                .setCancelable(false)
                .build();
        dialog.show();
         
  # for dismiss
dialog.dismiss()
```
##kotlin
``` 
val dialog: AlertDialog = SpotsProgressDialog.Builder()
    .setContext(this)
    .setMessage(R.string.custom_title)
    .setCancelable(false)
    .build()
    dialog.show()
    
  # for dismiss
dialog.dismiss()
```

For changing dialogs look and feel, create style and pass it ot dialog builder:
```kotlin
val dialog: AlertDialog = SpotsProgressDialog.Builder()
    .Builder()
    .setContext(context)
    .setTheme(R.style.Cusom)
    .build()
    dialog.show()
    
```

For styling the next custom attributes provided:
* DialogTitleAppearance : style reference
* DialogTitleText : string
* DialogSpotColor : color
* DialogSpotCount : integer

<h2>Created and maintained by:</h2>
<p>Er.Prem singh daksha  premsingh8171@gmail.com</p>
<p><a href="https://www.linkedin.com/in/prem-singh-daksha-82az/"> <img src="https://github.com/anitaa1990/DeviceInfo-Sample/blob/master/media/linkedin-icon.png" alt="Linkedin" style="max-width:100%;"> </a></p>
