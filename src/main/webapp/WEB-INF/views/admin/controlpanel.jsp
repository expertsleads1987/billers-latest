<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>

<!-- BEGIN PAGE LEVEL PLUGINS -->
<link href="${metronicBaseUrl}/assets/global/plugins/jstree/dist/themes/default/style.min.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL PLUGINS -->

<%--handlebars template start--%>
<script id="menu-edit-form-template" type="text/x-handlebars-template">
    <div class="form-group">
        <label class="col-md-2 control-label">ID</label>
        <div class="col-md-10">
            <input type="number" class="form-control" placeholder="ID" disabled value="{{id}}" id="menu-id">
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-2 control-label">Parent ID</label>
        <div class="col-md-10">
            <input type="number" class="form-control" placeholder="Parent ID" disabled value="{{parentId}}" id="parent-id">
        </div>
    </div>
    <div class="form-body">
        <div class="form-group">
            <label class="col-md-2 control-label">Menu Text</label>
            <div class="col-md-10">
                <input type="text" class="form-control" placeholder="Menu text" value="{{text}}" id="menu-text">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">Menu Sırası</label>
            <div class="col-md-10">
                <input type="number" class="form-control" placeholder="Menu sırası" value="{{order}}" id="menu-order">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">
                Aktif?
            </label>
            <div class="col-md-10">
                {{#if active}}
                <input type="checkbox" checked>
                {{else}}
                <input type="checkbox">
                {{/if}}
                <span></span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">Page Url</label>
            <div class="col-md-10">
                {{#if page}}
                <input type="text" class="form-control" placeholder="Page URL" value="{{bipPage.pageUrl}}" id="page-url">
                {{else}}
                <input type="text" class="form-control" placeholder="--" disabled>
                {{/if}}
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">Icon Class</label>
            <div class="col-md-10">
                <input type="text" class="form-control" placeholder="Icon class" value="{{iconClass}}" id="icon-class">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label"></label>
            <div class="col-md-10">
                <a href="https://github.com/thesabbir/simple-line-icons/blob/master/css/simple-line-icons.css">Icon Sınıfları</a>
            </div>
        </div>
        <div class="form-actions">
            <div class="row">
                <div class="col-md-offset-2 col-md-8">
                    <button type="button" class="btn green" id="update-menu-item">Kaydet</button>
                    <button type="button" class="btn default">İptal</button>
                </div>
            </div>
        </div>
    </div>
</script>
<%--handlebars template end--%>

<!-- BEGIN CONTENT -->
<div class="page-content-wrapper">
    <!-- BEGIN CONTENT BODY -->
    <
    <div class="page-content" style="min-height: 1932px;">
        <!-- BEGIN PAGE HEADER-->
        <!-- BEGIN THEME PANEL -->
        <div class="theme-panel hidden-xs hidden-sm">
            <div class="toggler"></div>
            <div class="toggler-close"></div>
            <div class="theme-options">
                <div class="theme-option theme-colors clearfix">
                    <span> THEME COLOR </span>
                    <ul>
                        <li class="color-default current tooltips" data-style="default" data-container="body" data-original-title="Default"></li>
                        <li class="color-darkblue tooltips" data-style="darkblue" data-container="body" data-original-title="Dark Blue"></li>
                        <li class="color-blue tooltips" data-style="blue" data-container="body" data-original-title="Blue"></li>
                        <li class="color-grey tooltips" data-style="grey" data-container="body" data-original-title="Grey"></li>
                        <li class="color-light tooltips" data-style="light" data-container="body" data-original-title="Light"></li>
                        <li class="color-light2 tooltips" data-style="light2" data-container="body" data-html="true" data-original-title="Light 2"></li>
                    </ul>
                </div>
                <div class="theme-option">
                    <span> Theme Style </span>
                    <select class="layout-style-option form-control input-sm">
                        <option value="square" selected="selected">Square corners</option>
                        <option value="rounded">Rounded corners</option>
                    </select>
                </div>
                <div class="theme-option">
                    <span> Layout </span>
                    <select class="layout-option form-control input-sm">
                        <option value="fluid" selected="selected">Fluid</option>
                        <option value="boxed">Boxed</option>
                    </select>
                </div>
                <div class="theme-option">
                    <span> Header </span>
                    <select class="page-header-option form-control input-sm">
                        <option value="fixed" selected="selected">Fixed</option>
                        <option value="default">Default</option>
                    </select>
                </div>
                <div class="theme-option">
                    <span> Top Menu Dropdown</span>
                    <select class="page-header-top-dropdown-style-option form-control input-sm">
                        <option value="light" selected="selected">Light</option>
                        <option value="dark">Dark</option>
                    </select>
                </div>
                <div class="theme-option">
                    <span> Sidebar Mode</span>
                    <select class="sidebar-option form-control input-sm">
                        <option value="fixed">Fixed</option>
                        <option value="default" selected="selected">Default</option>
                    </select>
                </div>
                <div class="theme-option">
                    <span> Sidebar Menu </span>
                    <select class="sidebar-menu-option form-control input-sm">
                        <option value="accordion" selected="selected">Accordion</option>
                        <option value="hover">Hover</option>
                    </select>
                </div>
                <div class="theme-option">
                    <span> Sidebar Style </span>
                    <select class="sidebar-style-option form-control input-sm">
                        <option value="default" selected="selected">Default</option>
                        <option value="light">Light</option>
                    </select>
                </div>
                <div class="theme-option">
                    <span> Sidebar Position </span>
                    <select class="sidebar-pos-option form-control input-sm">
                        <option value="left" selected="selected">Left</option>
                        <option value="right">Right</option>
                    </select>
                </div>
                <div class="theme-option">
                    <span> Footer </span>
                    <select class="page-footer-option form-control input-sm">
                        <option value="fixed">Fixed</option>
                        <option value="default" selected="selected">Default</option>
                    </select>
                </div>
            </div>
        </div>
        <!-- END THEME PANEL -->
        <!-- BEGIN PAGE BAR -->
        <div class="page-bar">
            <ul class="page-breadcrumb">
                <li>
                    <a href="index.html">Anasayfa</a>
                    <i class="fa fa-circle"></i>
                </li>
                <li>
                    <span>Control Panel</span>
                </li>
            </ul>
            <div class="page-toolbar">
                <div class="btn-group pull-right">
                    <button type="button" class="btn green btn-sm btn-outline dropdown-toggle" data-toggle="dropdown"> Actions
                        <i class="fa fa-angle-down"></i>
                    </button>
                    <ul class="dropdown-menu pull-right" role="menu">
                        <li>
                            <a href="#">
                                <i class="icon-bell"></i> Action</a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="icon-shield"></i> Another action</a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="icon-user"></i> Something else here</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <i class="icon-bag"></i> Separated link</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- END PAGE BAR -->
        <!-- BEGIN PAGE TITLE-->
        <h1 class="page-title"> Distributed transactions <br>
            <small>Distributed transactions via ActiveMQ Artemis broker, spring data jpa & xa datasources</small>
        </h1>
        <!-- END PAGE TITLE-->
        <!-- END PAGE HEADER-->
        <!-- BEGIN PAGE CONTENT-->
        <div class="row">
            <div class="col-md-12" id="content-div">
                The content
                <button id="send-jms-message"> Send Jms Message</button>

            </div>
        </div>
        <!-- END PAGE CONTENT-->
    </div>
</div>

<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="${metronicBaseUrl}/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script src="${metronicBaseUrl}/assets/layouts/layout/scripts/layout.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/layouts/layout/scripts/demo.min.js" type="text/javascript"></script>
<!-- END THEME LAYOUT SCRIPTS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${metronicBaseUrl}/assets/global/plugins/jstree/dist/jstree.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<%--<script src="${scriptBaseUrl}/sweetalert/sweetalert.min.js" type="text/javascript"></script>--%>
<script src="${scriptBaseUrl}/admin/controlpanel.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->