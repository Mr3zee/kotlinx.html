package kotlinx.html

class PartialImpl(override val consumer: TagConsumer<*>) : Partial {
    override val tagName: String
        get() = error("Partial does not have tagName")
    override val namespace: String
        get() = error("Partial does not have namespace")
    override val attributes: MutableMap<String, String>
        get() = error("Partial does not have attributes")
    override val attributesEntries: Collection<Map.Entry<String, String>>
        get() = error("Partial does not have attributesEntries")
    override val inlineTag: Boolean
        get() = error("Partial does not have inlineTag")
    override val emptyTag: Boolean
        get() = error("Partial does not have emptyTag")
}

fun <R> TagConsumer<R>.partial(body: Partial.() -> Unit): R {
    @Suppress("UNCHECKED_CAST")
    return PartialImpl(this).also(body).consumer.finalize() as R
}
