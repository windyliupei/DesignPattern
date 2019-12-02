从 ShapeCache.getShape中得到 Shape的实体，只是 ShapeCache 中的 hashtable中
实体的一个 **clone**对象。

需要注意的是使用这种模式，要记住保持对象的“原始不可改性”