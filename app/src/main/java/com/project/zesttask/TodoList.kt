package com.project.zesttask

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.zesttask.ui.theme.ZestTaskTheme

@Composable
fun TodoList(innerPadding: PaddingValues) {
   LazyColumn(content = {
       items(100) {
           Text("Item $it")
       }
   }, modifier = Modifier.fillMaxHeight())
}

@Preview
@Composable
fun TodoListPreview() {
    TodoList(innerPadding = PaddingValues(0.dp))
}