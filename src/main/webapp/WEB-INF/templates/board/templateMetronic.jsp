<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="morak">

    <c:set var="titleKey">
        <tiles:getAsString name="title"/>
    </c:set>

    <c:choose>
        <c:when test="${!empty title}">
            <title><c:out value="${title}"/></title>
        </c:when>
        <c:otherwise>
            <c:set var="titleKey">
                <tiles:getAsString name="title"/>
            </c:set>
            <title>Distributed Transactions (XA/JTA) Case Study | <spring:message code="${titleKey}" text="Webapp"/></title>
        </c:otherwise>
    </c:choose>

    <c:set var="username" scope="request" value="John Doe"/>
    <c:url value="/rest" var="restBaseUrl" scope="request"/>
    <c:url value="/login" var="loginUrl" scope="request"/>
    <script type="text/javascript">
        var username = '${username}', restBaseUrl = '${restBaseUrl}', loginUrl = '${loginUrl}';
    </script>

    <c:url var="cssBaseUrl" value="/static/css" scope="request"></c:url>
    <c:url var="scriptBaseUrl" value="/static/js" scope="request"></c:url>
    <c:url var="imageBaseUrl" value="/static/image" scope="request"></c:url>

    <c:url var="metronicBaseUrl" value="/static/metronic" scope="request"></c:url>

    <link rel="shortcut icon" href="${imageBaseUrl}/favicon.png"/>

    <c:url value="/logout" var="logoutUrl" scope="request"/>

    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
    <link href="${metronicBaseUrl}/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="${metronicBaseUrl}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
    <link href="${metronicBaseUrl}/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${metronicBaseUrl}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
    <link href="${metronicBaseUrl}/assets/global/plugins/bootstrap-sweetalert/sweetalert.css" rel="stylesheet" type="text/css"/>
    <link href="${metronicBaseUrl}/assets/global/plugins/bootstrap-toastr/toastr.min.css" rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN THEME GLOBAL STYLES -->
    <link href="${metronicBaseUrl}/assets/global/css/components-rounded.min.css" rel="stylesheet" id="style_components" type="text/css"/>
    <link href="${metronicBaseUrl}/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css"/>
    <!-- END THEME GLOBAL STYLES -->
    <!-- BEGIN THEME LAYOUT STYLES -->
    <link href="${metronicBaseUrl}/assets/layouts/layout2/css/layout.min.css" rel="stylesheet" type="text/css"/>
    <link href="${metronicBaseUrl}/assets/layouts/layout2/css/themes/blue.min.css" rel="stylesheet" type="text/css" id="style_color"/>
    <link href="${metronicBaseUrl}/assets/layouts/layout2/css/custom.min.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="${cssBaseUrl}/style.css" media="screen"/>

    <!-- END THEME LAYOUT STYLES -->
</head>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">

<!--[if lt IE 9]>
<script src="${metronicBaseUrl}/assets/global/plugins/respond.min.js"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/excanvas.min.js"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/ie8.fix.min.js"></script>
<![endif]-->
<!-- BEGIN CORE PLUGINS -->
<script src="${metronicBaseUrl}/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="${scriptBaseUrl}/handlebars/handlebars.min.js" type="text/javascript"></script>
<script src="${scriptBaseUrl}/sweetalert/sweetalert.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/bootstrap-toastr/toastr.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/bootbox/bootbox.min.js" type="text/javascript"></script>

<script type="text/javascript">
    toastr.options.positionClass = "toast-bottom-right";
</script>

<tiles:insertAttribute name="header"/>
<div class="page-container">
    <tiles:insertAttribute name="left"/>
    <tiles:insertAttribute name="body"/>
</div>
<tiles:insertAttribute name="footer"/>

<script src="${metronicBaseUrl}/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/jquery-inputmask/jquery.inputmask.bundle.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/global/plugins/jquery.input-ip-address-control-1.0.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="${metronicBaseUrl}/assets/global/scripts/app.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/pages/scripts/form-input-mask.min.js" type="text/javascript"></script>

<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script src="${metronicBaseUrl}/assets/layouts/layout2/scripts/layout.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/layouts/layout2/scripts/demo.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/layouts/global/scripts/quick-nav.min.js" type="text/javascript"></script>
<script src="${scriptBaseUrl}/biputils.js" type="text/javascript"></script>
<!-- END THEME LAYOUT SCRIPTS -->

</body>
</html>

