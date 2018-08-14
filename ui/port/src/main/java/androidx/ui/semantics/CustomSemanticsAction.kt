package androidx.ui.semantics

// / An identifier of a custom semantics action.
// /
// / Custom semantics actions can be provided to make complex user
// / interactions more accessible. For instance, if an application has a
// / drag-and-drop list that requires the user to press and hold an item
// / to move it, users interacting with the application using a hardware
// / switch may have difficulty. This can be made accessible by creating custom
// / actions and pairing them with handlers that move a list item up or down in
// / the list.
// /
// / In Android, these actions are presented in the local context menu. In iOS,
// / these are presented in the radial context menu.
// /
// / Localization and text direction do not automatically apply to the provided
// / label or hint.
// /
// / Instances of this class should either be instantiated with const or
// / new instances cached in static fields.
// /
// / See also:
// /
// /   * [androidx.ui.semantics.SemanticsProperties], where the handler for a custom action is provided.
// @immutable
class CustomSemanticsAction {
//  /// Creates a new [CustomSemanticsAction].
//  ///
//  /// The [label] must not be null or the empty string.
//  const CustomSemanticsAction({@required this.label})
//    : assert(label != null),
//      assert(label != ''),
//      hint = null,
//      action = null;
//
//  /// Creates a new [CustomSemanticsAction] that overrides a standard semantics
//  /// action.
//  ///
//  /// The [hint] must not be null or the empty string.
//  const CustomSemanticsAction.overridingAction({@required this.hint, @required this.action})
//    : assert(hint != null),
//      assert(hint != ''),
//      assert(action != null),
//      label = null;
//
//  /// The user readable name of this custom semantics action.
//  final String label;
//
//  /// The hint description of this custom semantics action.
//  final String hint;
//
//  /// The standard semantics action this action replaces.
//  final SemanticsAction action;
//
    override fun hashCode(): Int {
        TODO("Not implemented")
        // return ui.hashValues(label, hint, action)
    }

    override fun equals(other: Any?): Boolean {
        TODO("Not implemented")
//    if (other.runtimeType != runtimeType)
//      return false;
//    final CustomSemanticsAction typedOther = other;
//    return typedOther.label == label
//      && typedOther.hint == hint
//      && typedOther.action == action;
    }

    override fun toString(): String {
        TODO("Not implemented")
        // return 'CustomSemanticsAction(${_ids[this]}, label:$label, hint:$hint, action:$action)';
    }

//  // Logic to assign a unique id to each custom action without requiring
//  // user specification.
//  static int _nextId = 0;
//  static final Map<int, CustomSemanticsAction> _actions = <int, CustomSemanticsAction>{};
//  static final Map<CustomSemanticsAction, int> _ids = <CustomSemanticsAction, int>{};
//
//  /// Get the identifier for a given `action`.
//  static int getIdentifier(CustomSemanticsAction action) {
//    int result = _ids[action];
//    if (result == null) {
//      result = _nextId++;
//      _ids[action] = result;
//      _actions[result] = action;
//    }
//    return result;
//  }
//
//  /// Get the `action` for a given identifier.
//  static CustomSemanticsAction getAction(int id) {
//    return _actions[id];
//  }
}