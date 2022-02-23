/*
 * Copyright (C) 2022, developersancho
 * All rights reserved.
 */
package com.developersancho.framework.compose

import androidx.compose.runtime.Composable

typealias ComposableView = @Composable() () -> Unit

/**
 * This provides a clear readable name
 */
@Composable
fun ComposableView?.render() {
    this?.invoke()
}