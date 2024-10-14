package com.example.reelcraft

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailsScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        Text("Where Imagination Meets Motion: Join the ReelCraft Revolution!", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xFF6A1B9A))
        Spacer(modifier = Modifier.height(16.dp))

        DetailItem(label = "About", detail = "Are you ready to showcase your creativity and talent in the world of filmmaking? The ReelCraft Competition invites aspiring filmmakers, content creators, and enthusiasts to grab their cameras and let their imaginations soar!\n" +
                "\n" +
                "Join us for an exciting event where your passion for storytelling can shine. Whether you're a seasoned pro or just starting out, this competition is designed for everyone. Create your most captivating reel, express your unique vision, and compete for exciting prizes!")

        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "poster",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(500.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        DetailItem(label = "Venue", detail = "Atma Ram Sanatan Dharma College")
        DetailItem(label = "Date", detail = "October 25, 2024")
        DetailItem(label = "Prize Money", detail = "The top 3 entries will be winners who will get prize money worth INR 5,000, INR 3,000 and INR 1,000.")
        DetailItem(label = "Eligibility", detail = "Open to all undergraduate students")
        DetailItem(label = "Submission Deadline", detail = "October 20, 2024")
    }
}

@Composable
fun DetailItem(label: String, detail: String) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(label, fontSize = 18.sp, fontWeight = FontWeight.Medium, color = Color.Black)
        Text(detail, fontSize = 16.sp, color = Color.DarkGray)
    }
}