package com.example.flatandflatmates.view.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.flatandflatmates.R

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        setContent {
            Column {
                showProfileImage()
                showPreference()
                showOptions()
            }
        }
    }

    @Preview
    @Composable
    fun showProfileImage() {
        Row() {
            val imageResource = painterResource(id = R.drawable.female)
            Image(
                painter = imageResource,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(230.dp)
                    .padding(30.dp, 70.dp, 20.dp, 20.dp)
                    .clip(shape = RoundedCornerShape(8.dp))

            )
            Column() {
                Text(
                    text = stringResource(id = R.string.name),
                    color = colorResource(id = androidx.appcompat.R.color.material_blue_grey_800),
                    modifier = Modifier.padding(0.dp, 70.dp, 0.dp, 0.dp)
                )
                Text(
                    text = stringResource(id = R.string.shweta_sharma),
                    color = Color.Black,
                    modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)
                )
                Text(
                    text = stringResource(id = R.string.occupation_label),
                    color = colorResource(id = androidx.appcompat.R.color.material_blue_grey_800),
                    modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)
                )
                Text(
                    text = stringResource(id = R.string.occupation),
                    color = Color.Black,
                    modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)
                )

            }
        }

    }


    @Preview
    @Composable
    fun showPreference() {
        Row(modifier = Modifier.padding(10.dp, 30.dp, 10.dp, 10.dp)) {
            Text(text = "Looking for", modifier = Modifier.padding(30.dp, 10.dp, 0.dp, 0.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CutCornerShape(10),
                modifier = Modifier.padding(20.dp, 0.dp, 0.dp, 0.dp)
            ) {
                Text(text = "Room")
            }
            Button(
                onClick = { /*TODO*/ },
                shape = CutCornerShape(10),
                modifier = Modifier.padding(20.dp, 0.dp, 0.dp, 0.dp)
            ) {
                Text(text = "Roommate")
            }
        }
    }

    @Preview
    @Composable
    fun showOptions() {
        Column(modifier = Modifier.padding(30.dp, 20.dp, 20.dp, 20.dp)) {
            Row() {
                val imageResource = painterResource(id = R.drawable.baseline_person_outline_24)
                Image(
                    painter = imageResource,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp, 10.dp, 10.dp, 10.dp)

                )
                Text(
                    text = stringResource(id = R.string.bio), modifier = Modifier
                        .padding(10.dp, 15.dp, 10.dp, 0.dp)
                )
            }
            Row() {
                val imageResource = painterResource(id = R.drawable.baseline_event_note_24)
                Image(
                    painter = imageResource,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp, 10.dp, 10.dp, 10.dp)

                )
                Text(
                    text = stringResource(id = R.string.my_preferences), modifier = Modifier
                        .padding(10.dp, 15.dp, 10.dp, 0.dp)
                )
            }
            Row() {
                val imageResource = painterResource(id = R.drawable.baseline_settings_24)
                Image(
                    painter = imageResource,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp, 10.dp, 10.dp, 10.dp)

                )
                Text(
                    text = stringResource(id = R.string.setting), modifier = Modifier
                        .padding(10.dp, 15.dp, 10.dp, 0.dp)
                )
            }
            Row() {
                val imageResource = painterResource(id = R.drawable.baseline_help_outline_24)
                Image(
                    painter = imageResource,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp, 10.dp, 10.dp, 10.dp)

                )
                Text(
                    text = stringResource(id = R.string.help), modifier = Modifier
                        .padding(10.dp, 15.dp, 10.dp, 0.dp)
                )
            }
            Row() {
                val imageResource = painterResource(id = R.drawable.baseline_edit_note_24)
                Image(
                    painter = imageResource,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp, 10.dp, 10.dp, 10.dp)

                )
                Text(
                    text = stringResource(id = R.string.terms_and_condition), modifier = Modifier
                        .padding(10.dp, 15.dp, 10.dp, 0.dp)
                )
            }
            Row() {
                val imageResource = painterResource(id = R.drawable.baseline_logout_24)
                Image(
                    painter = imageResource,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp, 10.dp, 10.dp, 10.dp)

                )
                Text(
                    text = stringResource(id = R.string.logout), modifier = Modifier
                        .padding(10.dp, 15.dp, 10.dp, 0.dp)
                )
            }
        }
    }
}