package com.example.tave.components.glide

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.tave.common.Constants
import com.example.tave.ui.theme.Shape
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun GlideImageView(
    modifier: Modifier,
    imageUrl: String,
    painterResource: Int,
) {
    GlideImage(
        imageModel = { imageUrl } ,
        modifier = modifier,
        loading = {
            ShimmerEffectItem(
                isLoading = true,
                contentLoading = {  },
                contentAfterLoading = { },
                modifier = modifier
            )
        },
        success = { imageState, _ ->
            imageState.imageBitmap?.let { image ->
                Image(
                    bitmap = image,
                    contentScale = ContentScale.Crop,
                    contentDescription = Constants.IMAGE_LOAD_SUCCESS_CONTENT_DESC
                )
            }
        },
        failure = {
            Image(
                modifier = modifier
                    .fillMaxSize()
                    .clip(Shape.large),
                painter = painterResource(id = painterResource),
                contentScale = ContentScale.FillBounds,
                contentDescription = Constants.IMAGE_LOAD_FAILED_CONTENT_DESC
            )
        }
    )
}