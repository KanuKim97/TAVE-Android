package com.example.tave.components.noticeDetail

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tave.R
import com.example.tave.components.glide.GlideImageView
import com.example.tave.components.glide.ShimmerEffectItem
import com.example.tave.ui.font.NotoSansKr
import com.example.tave.ui.theme.NoticeImageCardCustomShape

@Composable
fun NoticeDetailCard(
    modifier: Modifier,
    cardTitle: String,
    noticeImage: List<String?>?,
    isLoading: Boolean
) {
    val imageItems: String = if (noticeImage?.isEmpty() == true) { "" } else { "${noticeImage?.first()}" }

    ShimmerEffectItem(
        isLoading = isLoading,
        contentLoading = {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clip(NoticeImageCardCustomShape.extraLarge)
                )
                Spacer(modifier = modifier.size(10.dp))
                Box(
                    modifier = modifier
                        .height(10.dp)
                        .clip(NoticeImageCardCustomShape.extraLarge)
                )
            }
        },
        contentAfterLoading = {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                GlideImageView(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clip(NoticeImageCardCustomShape.extraLarge),
                    imageUrl = imageItems,
                    painterResource = R.drawable.tave_cover
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = cardTitle,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = NotoSansKr,
                        fontWeight = FontWeight.Bold,
                        platformStyle = PlatformTextStyle(includeFontPadding = false)
                    )
                )
            }
        },
        modifier = modifier
    )
}