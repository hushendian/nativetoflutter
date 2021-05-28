import 'package:flutter/material.dart';
import 'package:flutter_module/main.dart';
import 'package:flutter_module/test.dart';

import 'search_widget.dart';

final routers = {
  "/test": (context) => TestApp(),
  "/search": (context, {arguments}) => SearchApp(arguments)
};
//固定写法
// ignore: prefer_function_declarations_over_variables
var onGenerateRoute = (RouteSettings settings) {
  // 统一处理
  final String? name = settings.name;
  final Function pageContentBuilder = routers[name] as Function;
  if (settings.arguments != null) {
    final Route route = MaterialPageRoute(
        builder: (context) =>
            pageContentBuilder(context, arguments: settings.arguments));
    return route;
  } else {
    final Route route =
        MaterialPageRoute(builder: (context) => pageContentBuilder(context));
    return route;
  }
};
