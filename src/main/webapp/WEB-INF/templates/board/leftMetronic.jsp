<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:directive.page contentType="text/html; charset=UTF-8"/>

<!-- BEGIN SIDEBAR -->
<div class="page-sidebar-wrapper">
    <!-- END SIDEBAR -->
    <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
    <!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
    <div class="page-sidebar navbar-collapse collapse">
        <!-- BEGIN SIDEBAR MENU -->
        <!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
        <!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
        <!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
        <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
        <!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
        <!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
        <ul class="page-sidebar-menu page-header-fixed page-sidebar-menu-hover-submenu" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
            <c:forEach var="mainMenu" items="${boardMenuAsTree.children}" varStatus="status">
                <c:choose>
                    <c:when test="${status.first}">
                        <c:set var="startClass" value="start"/>
                    </c:when>
                    <c:otherwise>
                        <c:set var="startClass" value=""/>
                    </c:otherwise>
                </c:choose>
                <c:if test="${mainMenu.readable or mainMenu.readWriteable}">
                    <li class="nav-item ${startClass} ">
                        <c:choose>
                            <c:when test="${empty mainMenu.children}">
                                <c:set var="mainMenuHref" value="${mainMenu.bipPage.pageUrl}"/>
                            </c:when>
                            <c:otherwise>
                                <c:set var="mainMenuHref" value="javascript:;"/>
                            </c:otherwise>
                        </c:choose>
                        <a href="${mainMenuHref}" class="nav-link nav-toggle">
                            <i class="${mainMenu.iconClass}"></i>
                            <span class="title">${mainMenu.text}</span>
                            <span class="arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <c:forEach var="subMenu" items="${mainMenu.children}" varStatus="subStatus">
                                <c:choose>
                                    <c:when test="${subStatus.first}">
                                        <c:set var="subStartClass" value="start"/>
                                    </c:when>
                                    <c:otherwise>
                                        <c:set var="subStartClass" value=""/>
                                    </c:otherwise>
                                </c:choose>
                                <c:if test="${subMenu.readable or subMenu.readWriteable}">
                                    <li class="nav-item ${subStartClass} ">
                                        <c:choose>
                                            <c:when test="${fn:length(subMenu.children) gt 0}">
                                                <a href="javascript:;" target="_blank" class="nav-link">
                                                    <i class="${subMenu.iconClass}"></i> ${subMenu.text}
                                                    <span class="arrow nav-toggle"></span>
                                                </a>
                                                <ul class="sub-menu">
                                                    <c:forEach var="subSubMenu" items="${subMenu.children}" varStatus="subSubStatus">
                                                        <c:choose>
                                                            <c:when test="${subSubStatus.first}">
                                                                <c:set var="subSubStartClass" value="start"/>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <c:set var="subSubStartClass" value=""/>
                                                            </c:otherwise>
                                                        </c:choose>
                                                        <c:if test="${subSubMenu.readable or subSubMenu.readWriteable}">
                                                            <li class="nav-item">
                                                                <a href="${subSubMenu.bipPage.pageUrl}" class="nav-link"
                                                                   title="${subSubMenu.readable} ${subSubMenu.readWriteable}">
                                                                    <i class="${subSubMenu.iconClass}"></i>${subSubMenu.text}</a>
                                                            </li>
                                                        </c:if>
                                                    </c:forEach>
                                                </ul>
                                            </c:when>
                                            <c:otherwise>
                                                <a href="${subMenu.bipPage.pageUrl}" class="nav-link" title="${subMenu.readable} ${subMenu.readWriteable}">
                                                    <i class="${subMenu.iconClass}"></i>
                                                    <span class="title">${subMenu.text}</span>
                                                </a>
                                            </c:otherwise>
                                        </c:choose>
                                    </li>
                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>
                </c:if>
            </c:forEach>
        </ul>
        <!-- END SIDEBAR MENU -->
    </div>
    <!-- END SIDEBAR -->
</div>
<!-- END SIDEBAR -->