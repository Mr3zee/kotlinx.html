package kotlinx.html

import kotlinx.html.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused", "EnumEntryName")
enum class Dir(override val realValue : String) : AttributeEnum {
    ltr("ltr"),
    rtl("rtl"),
    auto("auto")
}

internal val dirValues : Map<String, Dir> = Dir.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class Draggable(override val realValue : String) : AttributeEnum {
    htmlTrue("true"),
    htmlFalse("false"),
    auto("auto")
}

internal val draggableValues : Map<String, Draggable> = Draggable.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class RunAt(override val realValue : String) : AttributeEnum {
    server("server")
}

internal val runAtValues : Map<String, RunAt> = RunAt.entries.associateBy { it.realValue }
@Suppress("unused", "ConstPropertyName")
object ATarget {
    const val blank : String = "_blank"
    const val parent : String = "_parent"
    const val self : String = "_self"
    const val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

@Suppress("unused", "ConstPropertyName")
object ARel {
    const val alternate : String = "Alternate"
    const val appEndIx : String = "Appendix"
    const val bookmark : String = "Bookmark"
    const val chapter : String = "Chapter"
    const val contentS : String = "Contents"
    const val copyright : String = "Copyright"
    const val glossary : String = "Glossary"
    const val help : String = "Help"
    const val index : String = "Index"
    const val next : String = "Next"
    const val prev : String = "Prev"
    const val section : String = "Section"
    const val start : String = "Start"
    const val stylesheet : String = "Stylesheet"
    const val subsection : String = "Subsection"

    val values : List<String> = listOf("alternate", "appEndIx", "bookmark", "chapter", "contentS", "copyright", "glossary", "help", "index", "next", "prev", "section", "start", "stylesheet", "subsection")
}

@Suppress("unused", "ConstPropertyName")
object AType {
    const val textAsp : String = "text/asp"
    const val textAsa : String = "text/asa"
    const val textCss : String = "text/css"
    const val textHtml : String = "text/html"
    const val textJavaScript : String = "text/javascript"
    const val textPlain : String = "text/plain"
    const val textScriptLet : String = "text/scriptlet"
    const val textXComponent : String = "text/x-component"
    const val textXHtmlInsertion : String = "text/x-html-insertion"
    const val textXml : String = "text/xml"

    val values : List<String> = listOf("textAsp", "textAsa", "textCss", "textHtml", "textJavaScript", "textPlain", "textScriptLet", "textXComponent", "textXHtmlInsertion", "textXml")
}

@Suppress("unused", "EnumEntryName")
enum class AReferrerPolicy(override val realValue : String) : AttributeEnum {
    noReferrer("no-referrer"),
    noReferrerWhenDowngrade("no-referrer-when-downgrade"),
    origin("origin"),
    originWhenCrossOrigin("origin-when-cross-origin"),
    sameOrigin("same-origin"),
    strictOriginWhenCrossOrigin("strict-origin-when-cross-origin"),
    unsafeUrl("unsafe-url")
}

internal val aReferrerPolicyValues : Map<String, AReferrerPolicy> = AReferrerPolicy.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class AreaShape(override val realValue : String) : AttributeEnum {
    rect("rect"),
    circle("circle"),
    poly("poly"),
    default("default")
}

internal val areaShapeValues : Map<String, AreaShape> = AreaShape.entries.associateBy { it.realValue }
@Suppress("unused", "ConstPropertyName")
object AreaTarget {
    const val blank : String = "_blank"
    const val parent : String = "_parent"
    const val self : String = "_self"
    const val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

@Suppress("unused", "ConstPropertyName")
object AreaRel {
    const val alternate : String = "Alternate"
    const val appEndIx : String = "Appendix"
    const val bookmark : String = "Bookmark"
    const val chapter : String = "Chapter"
    const val contentS : String = "Contents"
    const val copyright : String = "Copyright"
    const val glossary : String = "Glossary"
    const val help : String = "Help"
    const val index : String = "Index"
    const val next : String = "Next"
    const val prev : String = "Prev"
    const val section : String = "Section"
    const val start : String = "Start"
    const val stylesheet : String = "Stylesheet"
    const val subsection : String = "Subsection"

    val values : List<String> = listOf("alternate", "appEndIx", "bookmark", "chapter", "contentS", "copyright", "glossary", "help", "index", "next", "prev", "section", "start", "stylesheet", "subsection")
}

@Suppress("unused", "ConstPropertyName")
object BaseTarget {
    const val blank : String = "_blank"
    const val parent : String = "_parent"
    const val self : String = "_self"
    const val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

@Suppress("unused", "EnumEntryName")
enum class ButtonFormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData("multipart/form-data"),
    applicationXWwwFormUrlEncoded("application/x-www-form-urlencoded"),
    textPlain("text/plain")
}

internal val buttonFormEncTypeValues : Map<String, ButtonFormEncType> = ButtonFormEncType.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class ButtonFormMethod(override val realValue : String) : AttributeEnum {
    get("get"),
    post("post"),
    @Deprecated("method is not allowed in browsers") put("put"),
    @Deprecated("method is not allowed in browsers") delete("delete"),
    @Deprecated("method is not allowed in browsers") patch("patch")
}

internal val buttonFormMethodValues : Map<String, ButtonFormMethod> = ButtonFormMethod.entries.associateBy { it.realValue }
@Suppress("unused", "ConstPropertyName")
object ButtonFormTarget {
    const val blank : String = "_blank"
    const val parent : String = "_parent"
    const val self : String = "_self"
    const val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

@Suppress("unused", "EnumEntryName")
enum class ButtonType(override val realValue : String) : AttributeEnum {
    button("button"),
    reset("reset"),
    submit("submit")
}

internal val buttonTypeValues : Map<String, ButtonType> = ButtonType.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class CommandType(override val realValue : String) : AttributeEnum {
    command("command"),
    checkBox("checkbox"),
    radio("radio")
}

internal val commandTypeValues : Map<String, CommandType> = CommandType.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class FormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData("multipart/form-data"),
    applicationXWwwFormUrlEncoded("application/x-www-form-urlencoded"),
    textPlain("text/plain")
}

internal val formEncTypeValues : Map<String, FormEncType> = FormEncType.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class FormMethod(override val realValue : String) : AttributeEnum {
    get("get"),
    post("post"),
    @Deprecated("method is not allowed in browsers") put("put"),
    @Deprecated("method is not allowed in browsers") delete("delete"),
    @Deprecated("method is not allowed in browsers") patch("patch")
}

internal val formMethodValues : Map<String, FormMethod> = FormMethod.entries.associateBy { it.realValue }
@Suppress("unused", "ConstPropertyName")
object FormTarget {
    const val blank : String = "_blank"
    const val parent : String = "_parent"
    const val self : String = "_self"
    const val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

@Suppress("unused", "ConstPropertyName")
object IframeName {
    const val blank : String = "_blank"
    const val parent : String = "_parent"
    const val self : String = "_self"
    const val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

@Suppress("unused", "EnumEntryName")
enum class IframeSandbox(override val realValue : String) : AttributeEnum {
    allowSameOrigin("allow-same-origin"),
    allowFormS("allow-forms"),
    allowScripts("allow-scripts")
}

internal val iframeSandboxValues : Map<String, IframeSandbox> = IframeSandbox.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class ImgLoading(override val realValue : String) : AttributeEnum {
    eager("eager"),
    lazy("lazy")
}

internal val imgLoadingValues : Map<String, ImgLoading> = ImgLoading.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class InputType(override val realValue : String) : AttributeEnum {
    button("button"),
    checkBox("checkbox"),
    color("color"),
    date("date"),
    dateTime("datetime"),
    dateTimeLocal("datetime-local"),
    email("email"),
    file("file"),
    hidden("hidden"),
    image("image"),
    month("month"),
    number("number"),
    password("password"),
    radio("radio"),
    range("range"),
    reset("reset"),
    search("search"),
    submit("submit"),
    text("text"),
    tel("tel"),
    time("time"),
    url("url"),
    week("week")
}

internal val inputTypeValues : Map<String, InputType> = InputType.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class InputFormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData("multipart/form-data"),
    applicationXWwwFormUrlEncoded("application/x-www-form-urlencoded"),
    textPlain("text/plain")
}

internal val inputFormEncTypeValues : Map<String, InputFormEncType> = InputFormEncType.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class InputFormMethod(override val realValue : String) : AttributeEnum {
    get("get"),
    post("post"),
    @Deprecated("method is not allowed in browsers") put("put"),
    @Deprecated("method is not allowed in browsers") delete("delete"),
    @Deprecated("method is not allowed in browsers") patch("patch")
}

internal val inputFormMethodValues : Map<String, InputFormMethod> = InputFormMethod.entries.associateBy { it.realValue }
@Suppress("unused", "ConstPropertyName")
object InputFormTarget {
    const val blank : String = "_blank"
    const val parent : String = "_parent"
    const val self : String = "_self"
    const val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

@Suppress("unused", "EnumEntryName")
enum class KeyGenKeyType(override val realValue : String) : AttributeEnum {
    rsa("rsa")
}

internal val keyGenKeyTypeValues : Map<String, KeyGenKeyType> = KeyGenKeyType.entries.associateBy { it.realValue }
@Suppress("unused", "ConstPropertyName")
object LinkRel {
    const val alternate : String = "Alternate"
    const val appEndIx : String = "Appendix"
    const val bookmark : String = "Bookmark"
    const val chapter : String = "Chapter"
    const val contentS : String = "Contents"
    const val copyright : String = "Copyright"
    const val glossary : String = "Glossary"
    const val help : String = "Help"
    const val index : String = "Index"
    const val next : String = "Next"
    const val prev : String = "Prev"
    const val section : String = "Section"
    const val start : String = "Start"
    const val stylesheet : String = "Stylesheet"
    const val subsection : String = "Subsection"

    val values : List<String> = listOf("alternate", "appEndIx", "bookmark", "chapter", "contentS", "copyright", "glossary", "help", "index", "next", "prev", "section", "start", "stylesheet", "subsection")
}

@Suppress("unused", "ConstPropertyName")
object LinkMedia {
    const val screen : String = "screen"
    const val print : String = "print"
    const val tty : String = "tty"
    const val tv : String = "tv"
    const val projection : String = "projection"
    const val handheld : String = "handheld"
    const val braille : String = "braille"
    const val aural : String = "aural"
    const val all : String = "all"

    val values : List<String> = listOf("screen", "print", "tty", "tv", "projection", "handheld", "braille", "aural", "all")
}

@Suppress("unused", "ConstPropertyName")
object LinkType {
    const val textAsp : String = "text/asp"
    const val textAsa : String = "text/asa"
    const val textCss : String = "text/css"
    const val textHtml : String = "text/html"
    const val textJavaScript : String = "text/javascript"
    const val textPlain : String = "text/plain"
    const val textScriptLet : String = "text/scriptlet"
    const val textXComponent : String = "text/x-component"
    const val textXHtmlInsertion : String = "text/x-html-insertion"
    const val textXml : String = "text/xml"

    val values : List<String> = listOf("textAsp", "textAsa", "textCss", "textHtml", "textJavaScript", "textPlain", "textScriptLet", "textXComponent", "textXHtmlInsertion", "textXml")
}

@Suppress("unused", "EnumEntryName")
enum class LinkAs(override val realValue : String) : AttributeEnum {
    audio("audio"),
    document("document"),
    embed("embed"),
    fetch("fetch"),
    font("font"),
    image("image"),
    htmlObject("object"),
    script("script"),
    style("style"),
    track("track"),
    video("video"),
    worker("worker")
}

internal val linkAsValues : Map<String, LinkAs> = LinkAs.entries.associateBy { it.realValue }
@Suppress("unused", "ConstPropertyName")
object MetaHttpEquiv {
    const val contentLanguage : String = "content-language"
    const val contentType : String = "content-type"
    const val defaultStyle : String = "default-style"
    const val refresh : String = "refresh"

    val values : List<String> = listOf("contentLanguage", "contentType", "defaultStyle", "refresh")
}

@Suppress("unused", "ConstPropertyName")
object ObjectName {
    const val blank : String = "_blank"
    const val parent : String = "_parent"
    const val self : String = "_self"
    const val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

@Suppress("unused", "ConstPropertyName")
object ScriptType {
    const val textEcmaScript : String = "text/ecmascript"
    const val textJavaScript : String = "text/javascript"
    const val textJavaScript10 : String = "text/javascript1.0"
    const val textJavaScript11 : String = "text/javascript1.1"
    const val textJavaScript12 : String = "text/javascript1.2"
    const val textJavaScript13 : String = "text/javascript1.3"
    const val textJavaScript14 : String = "text/javascript1.4"
    const val textJavaScript15 : String = "text/javascript1.5"
    const val textJScript : String = "text/jscript"
    const val textXJavaScript : String = "text/x-javascript"
    const val textXEcmaScript : String = "text/x-ecmascript"
    const val textVbScript : String = "text/vbscript"

    val values : List<String> = listOf("textEcmaScript", "textJavaScript", "textJavaScript10", "textJavaScript11", "textJavaScript12", "textJavaScript13", "textJavaScript14", "textJavaScript15", "textJScript", "textXJavaScript", "textXEcmaScript", "textVbScript")
}

@Suppress("unused", "EnumEntryName")
enum class ScriptCrossorigin(override val realValue : String) : AttributeEnum {
    anonymous("anonymous"),
    useCredentials("use-credentials")
}

internal val scriptCrossoriginValues : Map<String, ScriptCrossorigin> = ScriptCrossorigin.entries.associateBy { it.realValue }
@Suppress("unused", "ConstPropertyName")
object StyleType {
    const val textCss : String = "text/css"

    val values : List<String> = listOf("textCss")
}

@Suppress("unused", "ConstPropertyName")
object StyleMedia {
    const val screen : String = "screen"
    const val print : String = "print"
    const val tty : String = "tty"
    const val tv : String = "tv"
    const val projection : String = "projection"
    const val handheld : String = "handheld"
    const val braille : String = "braille"
    const val aural : String = "aural"
    const val all : String = "all"

    val values : List<String> = listOf("screen", "print", "tty", "tv", "projection", "handheld", "braille", "aural", "all")
}

@Suppress("unused", "EnumEntryName")
enum class TextAreaWrap(override val realValue : String) : AttributeEnum {
    hard("hard"),
    soft("soft"),
    @Deprecated("value only supported in IE") virtual("virtual"),
    @Deprecated("value only supported in IE") physical("physical"),
    @Deprecated("value only supported in IE") off("off")
}

internal val textAreaWrapValues : Map<String, TextAreaWrap> = TextAreaWrap.entries.associateBy { it.realValue }
@Suppress("unused", "EnumEntryName")
enum class ThScope(override val realValue : String) : AttributeEnum {
    col("col"),
    colGroup("colgroup"),
    row("row"),
    rowGroup("rowgroup")
}

internal val thScopeValues : Map<String, ThScope> = ThScope.entries.associateBy { it.realValue }
