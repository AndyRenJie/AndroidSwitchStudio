# AndroidSwitchStudio
 
这里提供一些Android种的Activity的跳转动画
 
### 淡入淡出效果
 
![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120801.gif)

```
<alpha xmlns:android="http://schemas.android.com/apk/res/android"
       android:interpolator="@android:anim/accelerate_interpolator"
       android:fromAlpha="0.0" android:toAlpha="1.0"
       android:duration="2000" />
```      
```
<translate xmlns:android="http://schemas.android.com/apk/res/android"
       android:interpolator="@android:anim/accelerate_interpolator"
       android:fromXDelta="0" android:toXDelta="0"
       android:duration="2000" />
```

### 放大淡出效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120802.gif)

```
<set xmlns:android="http://schemas.android.com/apk/res/android">
	<scale
		android:interpolator="@android:anim/accelerate_decelerate_interpolator"
		android:fromXScale="0.0"
		android:toXScale="1.0"
		android:fromYScale="0.0"
		android:toYScale="1.0"
		android:pivotX="50%"
		android:pivotY="50%"
		android:fillAfter="false"
		android:duration="2000" />
</set>
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android" >
<alpha
    android:fromAlpha="1.0"
    android:toAlpha="0"
    android:duration="2000"/>
</set>
```

### 转动淡出效果1

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120803.gif)

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
	android:shareInterpolator="false">
	<scale
		android:interpolator="@android:res/anim/accelerate_decelerate_interpolator"
		android:fromXScale="0.0"
		android:toXScale="1.0"
		android:fromYScale="0.0"
		android:toYScale="1.0"
		android:pivotX="50%"
		android:pivotY="50%"
		android:duration="2000"
		android:repeatCount="0"
		android:startOffset="20"></scale>
	<rotate
		android:interpolator="@android:anim/accelerate_decelerate_interpolator"
		android:fromDegrees="0"
		android:toDegrees="+360"
		android:pivotX="50%"
		android:pivotY="50%"
		android:duration="2000" />
</set>
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android" >
<alpha
    android:fromAlpha="1.0"
    android:toAlpha="0"
    android:duration="2000"/>
</set>
```

### 转动淡出效果1

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120804.gif)

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
	android:shareInterpolator="false">
	<scale
		android:interpolator="@android:res/anim/accelerate_decelerate_interpolator"
		android:fromXScale="0.0"
		android:toXScale="1.0"
		android:fromYScale="0.0"
		android:toYScale="1.0"
		android:pivotX="50%"
		android:pivotY="50%"
		android:duration="2000">
	</scale>
	<translate
		android:interpolator="@android:anim/accelerate_decelerate_interpolator"
		android:fromXDelta="120"
		android:toXDelta="30"
		android:fromYDelta="30"
		android:toYDelta="250"
		android:duration="2000" />
	<rotate
		android:interpolator="@android:anim/accelerate_decelerate_interpolator"
		android:fromDegrees="0"
		android:toDegrees="+360"
		android:pivotX="50%"
		android:pivotY="50%"
		android:duration="2000" />
</set>    
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android" >
<alpha
    android:fromAlpha="1.0"
    android:toAlpha="0"
    android:duration="2000"/>
</set>
```

### 左上角展开淡出效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120805.gif)

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
	android:shareInterpolator="false">
	<scale
		android:interpolator="@android:res/anim/accelerate_decelerate_interpolator"
		android:fromXScale="0.0"
		android:toXScale="1.0"
		android:fromYScale="0.0"
		android:toYScale="1.0"
		android:pivotX="0"
		android:pivotY="0"
		android:duration="2000"
		android:repeatCount="0"
		android:startOffset="0"></scale>
	<translate
		android:fromXDelta="0"
		android:toXDelta="0"
		android:fromYDelta="0"
		android:toYDelta="0"
		android:duration="2000" />
</set>
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android" >
<alpha
    android:fromAlpha="1.0"
    android:toAlpha="0"
    android:duration="2000"/>
</set>
```

### 压缩变小淡出效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120806.gif)
 
```
<alpha xmlns:android="http://schemas.android.com/apk/res/android"
    android:fromAlpha="0.0"
    android:toAlpha="1.0"
    android:duration="2000"
    android:startOffset="1200" />
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
	android:shareInterpolator="false">
	<scale
		android:interpolator="@android:anim/accelerate_decelerate_interpolator"
		android:fromXScale="1.0"
		android:toXScale="1.4"
		android:fromYScale="1.0"
		android:toYScale="0.6"
		android:pivotX="50%"
		android:pivotY="50%"
		android:fillAfter="false"
		android:duration="2000" />
	<set
		android:interpolator="@android:anim/accelerate_interpolator"
		android:startOffset="700">
		<scale
			android:fromXScale="1.4"
			android:toXScale="0.0"
			android:fromYScale="0.6"
			android:toYScale="0.0"
			android:pivotX="50%"
			android:pivotY="50%"
			android:duration="2000" />
		<rotate
			android:fromDegrees="0"
			android:toDegrees="-45"
			android:toYScale="0.0"
			android:pivotX="50%"
			android:pivotY="50%"
			android:duration="2000" />
	</set>
</set>
```

### 右往左推出效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120807.gif)

```
<set xmlns:android="http://schemas.android.com/apk/res/android">
	<translate
		android:fromXDelta="100%p"
		android:toXDelta="0"
		android:duration="2000" />
</set>
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android" >
    <translate
        android:duration="2000"
        android:fromXDelta="0"
        android:toXDelta="-100%p" />
</set>
```

### 下往上推出效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120808.gif)

```
<set xmlns:android="http://schemas.android.com/apk/res/android">
	<translate
		android:fromYDelta="100%p"
		android:toYDelta="0"
		android:duration="2000"/>
	<alpha
		android:fromAlpha="0.0"
		android:toAlpha="1.0"
		android:duration="2000" />
</set>
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android">
	<translate android:fromYDelta="0"
		android:toYDelta="-100%p"
		android:duration="2000"/>
	<alpha
		android:fromAlpha="1.0"
		android:toAlpha="0.0"
		android:duration="2000" />
</set>
```

### 左右交错效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120809.gif)
 
```
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/accelerate_interpolator">
    <translate
        android:fromXDelta="100%p"
        android:toXDelta="0"
        android:duration="2000" />
</set>
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/accelerate_interpolator">
    <translate
        android:fromXDelta="-100%p"
        android:toXDelta="0"
        android:duration="2000" />
</set>
```

### 放大淡出效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120810.gif)

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
	android:interpolator="@android:anim/accelerate_interpolator">
	<alpha
		android:fromAlpha="0.0"
		android:toAlpha="1.0"
		android:duration="2000" />
	<scale
		android:fromXScale="0.5"
		android:toXScale="1.5"
		android:fromYScale="0.5"
		android:toYScale="1.5"
		android:pivotX="50%"
		android:pivotY="50%"
		android:duration="2000" />
	<scale
		android:fromXScale="1.5"
		android:toXScale="1.0"
		android:fromYScale="1.5"
		android:toYScale="1.0"
		android:pivotX="50%"
		android:pivotY="50%"
		android:startOffset="200"
		android:duration="2000" />
</set>
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android" >
<alpha
    android:fromAlpha="1.0"
    android:toAlpha="0"
    android:duration="2000"/>
</set>
```

### 缩小效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120811.gif)

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
	android:interpolator="@android:anim/decelerate_interpolator">
	<alpha
		android:fromAlpha="0"
		android:toAlpha="1.0"
		android:duration="2000" />
	<scale
		android:fromXScale="2.0"
		android:toXScale="1.0"
		android:fromYScale="2.0"
		android:toYScale="1.0"
		android:pivotX="50%p"
		android:pivotY="50%p"
		android:duration="2000" />
</set>
```

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
        android:interpolator="@android:anim/decelerate_interpolator"
        android:zAdjustment="top">
    <scale
        android:fromXScale="1.0"
        android:toXScale="0"
        android:fromYScale="1.0"
        android:toYScale="0"
        android:pivotX="0"
        android:pivotY="0"
        android:duration="2000" />
    <alpha
        android:fromAlpha="1.0"
        android:toAlpha="0"
        android:duration="2000"/>
</set>
```

### 上下交错效果

![image](https://github.com/AndyRenJie/AndroidSwitchStudio/blob/master/gif/120812.gif)

```
<set android:interpolator="@android:anim/decelerate_interpolator"
	xmlns:android="http://schemas.android.com/apk/res/android">
	<translate
		android:duration="2000"
		android:fromYDelta="100.0%p"
		android:toYDelta="0.0" />
</set>
```

```
<set android:interpolator="@android:anim/accelerate_interpolator"
	xmlns:android="http://schemas.android.com/apk/res/android">
	<translate
		android:duration="2000"
		android:fromYDelta="0.0"
		android:toYDelta="100.0%p" />
</set>
```





