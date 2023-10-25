package com.example.flatandflatmates.view.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flatandflatmates.R

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.padding(
                    10.dp, 10.dp, 10.dp, 10.dp
                )
            ) {
                showHeader()
                loginWithLinkedInButton()
                orOptions()
                loginWithEmailOrPhone()
                loginWithPassword()
                forgotYourPassword()
                loginButton()
                termsAndConditions()
            }
        }
    }

    @Preview
    @Composable
    fun showHeader() {
        Text(
            text = stringResource(id = R.string.login_to_your_account),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp),
            color = colorResource(id = R.color.black),
        )
    }

    @Preview
    @Composable
    fun loginWithLinkedInButton() {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 20.dp, 10.dp, 10.dp)
        ) {
            Text(text = stringResource(id = R.string.continue_with_linkedIn))
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun loginWithEmailOrPhone() {
        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(text = stringResource(id = R.string.email_or_phone)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 20.dp, 20.dp, 10.dp)

        )
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun loginWithPassword() {
        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(text = stringResource(id = R.string.password)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 10.dp, 20.dp, 10.dp)

        )
    }

    fun isValidEmail(text: String): Boolean {
        // Implement your email validation logic here
        val emailRegex = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}".toRegex()
        return emailRegex.matches(text)
    }

    fun isValidPhoneNumber(text: String): Boolean {
        // Implement your phone number validation logic here
        val phoneRegex = "^[0-9]{10}\$".toRegex()
        return phoneRegex.matches(text)
    }


    @Composable
    fun orOptions() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 10.dp, 20.dp, 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .weight(1.3f)
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
            ) {
                Text(
                    "", modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = colorResource(id = R.color.black))
                )
            }
            Box(
                modifier = Modifier
                    .weight(0.4f)
                    .padding(20.dp, 0.dp, 0.dp, 0.dp)
            ) {
                Text(text = stringResource(id = R.string.or))
            }
            Box(
                modifier = Modifier
                    .weight(1.3f)
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
            ) {
                Text(
                    "", modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = colorResource(id = R.color.black))
                )
            }
        }
    }


    @Preview
    @Composable
    fun forgotYourPassword() {
        Text(
            text = stringResource(id = R.string.forgot_your_password),
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 10.dp, 0.dp, 10.dp),
            color = colorResource(id = R.color.purple_500),
        )
    }

    @Preview
    @Composable
    fun loginButton() {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 10.dp, 10.dp, 10.dp)
        ) {
            Text(text = stringResource(id = R.string.login))
        }
    }


    @Preview
    @Composable
    fun termsAndConditions() {
        Text(
            text = stringResource(id = R.string.terms_and_conditions),
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 10.dp, 0.dp, 10.dp),
            color = colorResource(id = R.color.black),
        )
    }


}