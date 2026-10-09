package com.example.composearticle2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearticle2.ui.theme.ComposeArticle2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticle2Theme {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleContent()
                }
            }
        }
    }
}

@Composable
fun ArticleContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(R.string.article_title),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.article_first_paragraph),
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.article_second_paragraph),
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticle2Theme {
        ArticleContent()
    }
}