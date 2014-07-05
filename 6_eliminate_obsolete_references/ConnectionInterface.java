interface ConnectionInterface {
  String fetchResource(String path);
  void destroyConnection();
}
