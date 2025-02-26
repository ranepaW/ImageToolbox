package ru.tech.imageresizershrinker.data.image.filters


import android.content.Context
import android.graphics.Bitmap
import jp.co.cyberagent.android.gpuimage.filter.GPUImageFilter
import jp.co.cyberagent.android.gpuimage.filter.GPUImageLaplacianFilter
import ru.tech.imageresizershrinker.domain.image.filters.Filter


class LaplacianFilter(
    private val context: Context,
    override val value: Unit = Unit,
) : GPUFilterTransformation(context), Filter.Laplacian<Bitmap> {
    override val cacheKey: String
        get() = (value to context).hashCode().toString()

    override fun createFilter(): GPUImageFilter = GPUImageLaplacianFilter()
}