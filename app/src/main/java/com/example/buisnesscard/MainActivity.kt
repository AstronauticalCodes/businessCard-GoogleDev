package com.example.buisnesscard

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.buisnesscard.ui.theme.BuisnessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuisnessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    ContactInfo(1, 123, 444_555_666, "jen.doe@android.com", "AndroidDev")
                    BuisnessCardMiddle("Jennifer Doe", "Android Developer Extraordinaire")
                    BuisnessCardBottom("Jennifer Doe", "Android Developer Extraordinaire", 1, 123, 444_555_666, "jen.doe@android.com", "AndroidDev")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Heading(name: String, title: String, modifier: Modifier = Modifier) {
    val profileImage = painterResource(R.drawable.profile_image)
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = profileImage,
            contentDescription = stringResource(R.string.profile_image),
            modifier = Modifier
                .height(120.dp)
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = name,
            fontSize = 40.sp,
//            fontWeight = FontWeight.Regular
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = title,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun BuisnessCardBottom(name: String, title: String, modifier: Modifier = Modifier) {
//    Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
//        Heading()
//    }
}

@Composable
fun ContactInfo(
    countryCode: Int,
    areaCode: Int,
    phnNumber: Int,
    mail: String,
    socialMediaHandle: String,
    modifier: Modifier = Modifier
) {
    val callImage = painterResource(R.drawable.call_icon)
    val mailImage = painterResource(R.drawable.mail_icon)
    val shareImage = painterResource(R.drawable.share_icon)
    Column(modifier = Modifier.padding(bottom = 50.dp), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Spacer(modifier = Modifier.height(15.dp))
        Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.padding(5.dp)) {
            Image(
                painter = callImage,
                contentDescription = stringResource(R.string.phone_icon),
                modifier = Modifier.height(24.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "+$countryCode ($areaCode) $phnNumber",
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.padding(5.dp)) {
            Image(
                painter = shareImage,
                contentDescription = stringResource(R.string.share_icon),
                modifier = Modifier.height(24.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "@$socialMediaHandle",
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.padding(5.dp)){
            Image(
                painter = mailImage,
                contentDescription = stringResource(R.string.mail_icon),
                modifier = Modifier.height(24.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = mail,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
    }
}

@Composable
fun BuisnessCardMiddle(name: String, title: String) {
    val profileImage = painterResource(R.drawable.profile_image)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom=60.dp)
            .background(Color(0xFFD2E8D4)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = profileImage,
            contentDescription = stringResource(R.string.profile_image),
            modifier = Modifier
                .height(120.dp),
//            colorFilter = ColorFilter.tint(Color(0xFFD2E8D4))
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = name,
            fontSize = 40.sp,
//            fontWeight = FontWeight.Regular
            fontWeight = FontWeight.Light,
            color = Color(0xFF060f09)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = title,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2c7f52)
        )
    }
}

@Composable
fun BuisnessCardBottom(name: String, title: String, countryCode: Int, areaCode:Int, phnNumber: Int, mail: String, socialMediaHandle: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val backgroundColor = Color(0xFFD2E8D4)
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 60.dp),
//                .background(backgroundColor),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .width(IntrinsicSize.Max)
                    .padding(16.dp)
            ) {
                RowCreator(R.drawable.call_icon, "+$countryCode ($areaCode) $phnNumber")
                RowCreator(R.drawable.share_icon, "@$socialMediaHandle")
                RowCreator(R.drawable.mail_icon, mail)
            }
        }
    }
}

@Composable
fun RowCreator(iconRes: Int, text: String, modifier: Modifier = Modifier){
    Row(
        modifier = Modifier
            .padding(vertical = 4.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        )
    }
}

@Composable
fun BottomCenterColumn() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .align  (Alignment.BottomCenter)
                .width(IntrinsicSize.Max)
                .padding(16.dp)
        ) {
            RowItem(iconRes = R.drawable.call_icon, text = "Item 1")
            RowItem(iconRes = R.drawable.share_icon, text = "Item 2")
            RowItem(iconRes = R.drawable.mail_icon, text = "Item 3")
        }
    }
}

@Composable
fun RowItem(iconRes: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        )
    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun AIPreview() {
//    BottomCenterColumn()
//}

@Preview(showBackground = true)
@Composable
fun MyPreview() {
    BuisnessCardTheme {
        BuisnessCardMiddle("Jennifer Doe", "Android Developer Extraordinaire")
        BuisnessCardBottom("Jennifer Doe", "Android Developer Extraordinaire", 1, 123, 444_555_666, "jen.doe@android.com", "AndroidDev")
//        Greeting("Android")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    BuisnessCardTheme {
////        Greeting("Android")
////        ContactInfo(1, 123, 444_555_666, "jen.doe@android.com", "AndroidDev")
//        BuisnessCard("Jennifer Doe", "Android Developer Extraordinaire", 1, 123, 444_555_666, "jen.doe@android.com", "AndroidDev")
//
////        Heading("Jennifer Doe", "Android Developer Extraordinaire")
//    }
//}