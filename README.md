# A naive Jetpack Compose LazyStaggeredGrid

This library provides a basic (but VERY performant) implementation of a lazy staggered grid for Jetpack Compose.

It does this by aligning multiple LazyColumns next to each other and synchronising their scrolling.

It automatically handles the allocation of items to the correct column.

## Example

<img src=sample/staggered.gif width=800 />

## Usage

```kotlin
LazyStaggeredGrid(columnCount = 2) {
    (0..100).forEach { _ ->
        item {
            Box(modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(ratio = random.nextDouble(0.2, 1.8).toFloat())
                .background(Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)))
            )
        }
    }
}
```
